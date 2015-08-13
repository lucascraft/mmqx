/***********************************************************************************
 * Cross Queues - A Model driven I/O queues utilities framework 
 * 
 * Copyright (c) 2008 - 2012, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * A) LGPL
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 * 
 * B) EPL
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/

package net.sf.xqz.engine.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import net.sf.xqz.engine.cmd.clients.QxMonitorJob;
import net.sf.xqz.engine.cmd.utils.CmdUtil;
import net.sf.xqz.engine.queues.QxAdapterImpl;
import net.sf.xqz.engine.queues.QxEventAdapterImpl;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.CompoundCmd;
import net.sf.xqz.model.cmd.PRIORITY;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.EngineClient;
import net.sf.xqz.model.engine.EngineFactory;
import net.sf.xqz.model.engine.EnginePackage;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.IChannel;
import net.sf.xqz.model.engine.Qx;
import net.sf.xqz.model.engine.QxProcessingStrategy;
import net.sf.xqz.model.engine.Rx;
import net.sf.xqz.model.engine.Tx;
import net.sf.xqz.model.temporal.TimeInfo;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.query.conditions.eobjects.EObjectTypeRelationCondition;
import org.eclipse.emf.query.conditions.eobjects.TypeRelation;
import org.eclipse.emf.query.conditions.eobjects.structuralfeatures.EObjectAttributeValueCondition;
import org.eclipse.emf.query.conditions.numbers.NumberCondition;
import org.eclipse.emf.query.statements.FROM;
import org.eclipse.emf.query.statements.IQueryResult;
import org.eclipse.emf.query.statements.SELECT;
import org.eclipse.emf.query.statements.WHERE;
import org.eclipse.emf.transaction.RunnableWithResult;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;

/**
 * 
 * Helper for engine operations
 * 
 */
public class EngineUtil {
	/* Transactional editing domain */
    public static TransactionalEditingDomain qxTransactionalEditingDomain;
    
    private static QxRunnable<Cmd> qxRunner;
    private static QxSyncRunnable<Cmd> qxSyncRunner;
    
    /** Singleton */
    public static EngineUtil INSTANCE = new EngineUtil();
    
    /** Constructor */
    public EngineUtil() {
        qxTransactionalEditingDomain 	= TransactionalEditingDomainImpl.FactoryImpl.INSTANCE.createEditingDomain();
        qxRunner 						= new QxRunnable<Cmd>();
        qxSyncRunner 					= new QxSyncRunnable<Cmd>();
    }
    
    
    /** 
     * Create an event given a {@link EVENT_KIND} and its associated {@link Command}
     *
     * @param kind an event kind (RX_ADDED, RX_REMOVED, TX_ADDED, TX_REMOVED)
     * @param command {@link Cmd} command associated to the event it raises
     * 
     * @return the newly created {@link EVENT_KIND} event
     */
    public Event createEvent(EVENT_KIND kind, Cmd command) {
        return createEvent(kind, command, null, System.currentTimeMillis());
    }
    
    /**
     * Create an event given a {@link EVENT_KIND} and its associated {@link Command} on a particular {@link Qx} queue
     *
     * @param kind an event kind (RX_ADDED, RX_REMOVED, TX_ADDED, TX_REMOVED)
     * @param command {@link Cmd} command associated to the event it raises
     * @param Qx queue the event comes from
     * 
     * @return the newly created {@link EVENT_KIND} event
     */
    public Event createEvent(EVENT_KIND kind, Cmd command, Qx qx) {
        return createEvent(kind, command, qx, System.currentTimeMillis());
    }
    
    /**
     * Create an event given a {@link EVENT_KIND} and its associated {@link Command} on a particular {@link Qx} queue
     *
     * @param kind an event kind (RX_ADDED, RX_REMOVED, TX_ADDED, TX_REMOVED)
     * @param command {@link Cmd} command associated to the event it raises
     * @param Qx queue the event comes from
     * @param time the time stamp giving the moment the event happened 
     * 
     * @return the newly created {@link EVENT_KIND} event
     */
    public Event createEvent(EVENT_KIND kind, Cmd command, Qx qx, long time) {
        Event evt = EngineFactory.eINSTANCE.createEvent();
        evt.setKind(kind);
        evt.setCmd(command);
        evt.setQx(qx);
        evt.setTime(time);
        return evt;
    }
     
    //
    // Time range
    //

    /**
     * Generically retrieves the events belonging to a given time range expressed as a {@link TimeInfo}.
     * 
     * @param qx a Qx queue from which we want to retrieve the events
     * @param a {@link TimeInfo} time range from which bounds we want the events fitting
     * 
     * @return a list of {@link Event} events corresponding to to the given time range and queue
     */
    public <T extends Qx> List<Event> getEventsFromTimeInfo(Qx qx, TimeInfo timeInfo) {
    	return getEventsWithinGivenTimeRange(
    		qx,
    		timeInfo.getStart(),
    		timeInfo.getStart() + (timeInfo.getDuration() * 1000),
    		true,
    		true,
    		qx instanceof Rx ? new EVENT_KIND[] { EVENT_KIND.RX_DONE, EVENT_KIND.RX_READY} : 
    			new EVENT_KIND[] { EVENT_KIND.TX_DONE, EVENT_KIND.TX_READY }
    	);
    }
    
    /**
     * Specifically retrieves the *create* events belonging to a given time range expressed as a {@link TimeInfo}.
     * 
     * @param qx a Qx queue from which we want to retrieve the events
     * @param a {@link TimeInfo} time range from which bounds we want the events fitting
     * 
     * @return a list of *create* {@link Event} events corresponding to to the given time range and queue
     */
   public <T extends Qx> List<Event> getCreateEventsFromTimeInfo(Qx qx, TimeInfo timeInfo) {
    	return getEventsWithinGivenTimeRange(
    		qx,
    		timeInfo.getStart(),
    		timeInfo.getStart() + timeInfo.getDuration(),
    		true,
    		true,
    		qx instanceof Rx ? EVENT_KIND.RX_DONE : EVENT_KIND.TX_DONE
    	);
    }
    
   /**
    * Specifically retrieves the *delete* events belonging to a given time range expressed as a {@link TimeInfo}.
    * 
    * @param qx a Qx queue from which we want to retrieve the events
    * @param a {@link TimeInfo} time range from which bounds we want the events fitting
    * 
    * @return a list of *delete* {@link Event} events corresponding to to the given time range and queue
    */
    public <T extends Qx> List<Event> getDeleteEventsFromTimeInfo(Qx qx, TimeInfo timeInfo) {
    	return getEventsWithinGivenTimeRange(
    		qx,
    		timeInfo.getStart(),
    		timeInfo.getStart() + timeInfo.getDuration(),
    		true,
    		true,
    		qx instanceof Rx ? EVENT_KIND.RX_DONE : EVENT_KIND.TX_DONE
    	);
    }
    
    /**
     * Generically retrieves the events belonging to a given time range expressed as lower and upper time bounds.
     * 
     * @param qx a Qx queue from which we want to retrieve the events
     * @param timeFrom lower time bound
     * @param timeTo upper time bound
     * @param lowerInclusive true if lower bound inclusive, false otherwise
     * @param upperInclusive true if upper bound inclusive, false otherwise
     * @param kindsToRetrieve a collection of kinds to retrieve among (RX_ADDED, RX_REMOVED, TX_ADDED, TX_REMOVED)
     * 
     * @return a list of {@link Event} events corresponding to to the given time range and queue
     */
    public <T extends Qx> List<Event> getEventsWithinGivenTimeRange(
    		final T qx, long timeFrom, long timeTo, 
    		boolean lowerInclusive, boolean upperInclusive, 
    		EVENT_KIND... kindsToRetrieve
    ) {
    	assert(timeFrom < timeTo);
   	
    	EObjectAttributeValueCondition condition;
    	if (lowerInclusive && upperInclusive) {
    		condition = new EObjectAttributeValueCondition(
	    		EnginePackage.eINSTANCE.getEvent_Time(), 
	    		NumberCondition.between(timeFrom, timeTo)
	    	);
    	} else if (lowerInclusive && !upperInclusive) {
    		condition = new EObjectAttributeValueCondition(
	    		EnginePackage.eINSTANCE.getEvent_Time(), 
	    		NumberCondition.greaterThanOrEquals(timeFrom)
	    	);
    	} else if (!lowerInclusive && upperInclusive) {
    		condition = new EObjectAttributeValueCondition(
	    		EnginePackage.eINSTANCE.getEvent_Time(), 
	    		NumberCondition.lessThanOrEquals(timeTo)
	    	);
    	} else {
    		condition = new EObjectAttributeValueCondition(
	    		EnginePackage.eINSTANCE.getEvent_Time(), 
	    		NumberCondition.lessThan(timeTo).AND(
	    			NumberCondition.greaterThan(timeFrom)
	    		)
	    	);
    	}
    	
    	IQueryResult result = new SELECT(
    		new FROM(getEvents(qx, kindsToRetrieve)), 
    		new WHERE(condition)
    	).execute();
    	
    	return Arrays.asList(result.toArray(new Event[0]));
    }

    //
    // To a given time
    //
    
    // Create
    /**
     * Specifically retrieves the *create* events that happened from the very beginning to a given time (inclusive).
     * 
     * @param qx a given Qx queue (Either Tx or Rx)
     * @param time a time until which the create events happened
     * 
     * @return a list of {@link Event} corresponding to given time and queue parameters
     */
    public <T extends Qx> List<Event> getCreateEventsToGivenTime(final T qx, long time) {
    	return getCreateEventsToGivenTime(qx, time, true);
    }
    
    /**
     * Specifically retrieves the *create* events that happened from the very beginning to a given time (inclusive).
     * 
     * @param qx a given Qx queue (Either {@link Tx} or {@link Rx})
     * @param time a time until which the create events happened
     * @param true if events should be temporally considered in a inclusive maner, false otherwise 
     * 
     * @return a list of {@link Event} corresponding to given time and queue parameters
     */
    public <T extends Qx> List<Event> getCreateEventsToGivenTime(final T qx, long time, boolean inclusive) {
    	return getEventsToGivenTime(qx, time, inclusive, EVENT_KIND.RX_READY, EVENT_KIND.TX_READY);
    }

    // Delete
    /**
     * Specifically retrieves the *delete* events that happened from the very beginning to a given time (inclusive).
     * 
     * @param qx a given Qx queue (Either {@link Tx} or {@link Rx})
     * @param time a time until which the create events happened
     * 
     * @return a list of {@link Event} corresponding to given time and queue parameters
     */
   public <T extends Qx> List<Event> getDeleteEventsToGivenTime(final T qx, long time) {
    	return getCreateEventsToGivenTime(qx, time, true);
    }
    
   /**
    * Specifically retrieves the *delete* events that happened from the very beginning to a given time (inclusive).
    * 
    * @param qx a given Qx queue (Either {@link Tx} or {@link Rx})
    * @param time a time until which the create events happened
    * @param true if events should be temporally considered in a inclusive maner, false otherwise 
    * 
    * @return a list of {@link Event} corresponding to given time and queue parameters
    */
    public <T extends Qx> List<Event> getDeleteEventsToGivenTime(final T qx, long time, boolean inclusive) {
    	return getEventsToGivenTime(qx, time, inclusive, qx instanceof Rx ? EVENT_KIND.RX_DONE : EVENT_KIND.TX_DONE);
    }

    // All
    /**
     * Specifically retrieves *all* events that happened from the very beginning to a given time (inclusive).
     * 
     * @param qx a given Qx queue (Either {@link Tx} or {@link Rx})
     * @param time a time until which the create events happened
     * 
     * @return a list of {@link Event} corresponding to given time and queue parameters
     */
   public <T extends Qx> List<Event> getEventsToGivenTime(final T qx, long time) {
    	return getEventsToGivenTime(qx, time, true);
    }
    
   /**
    * Specifically retrieves *all* events that happened from the very beginning to a given time (inclusive).
    * 
    * @param qx a given Qx queue (Either {@link Tx} or {@link Rx})
    * @param time a time until which the create events happened
    * @param true if events should be temporally considered in a inclusive maner, false otherwise 
    * 
    * @return a list of {@link Event} corresponding to given time and queue parameters
    */
   public <T extends Qx> List<Event> getEventsToGivenTime(final T qx, long time, boolean inclusive) {
    	return getEventsToGivenTime(qx, time, inclusive, qx instanceof Rx ? new EVENT_KIND[] { EVENT_KIND.RX_DONE, EVENT_KIND.RX_READY} : 
			new EVENT_KIND[] { EVENT_KIND.TX_DONE, EVENT_KIND.TX_READY });
    }
    
   /**
    * Specifically retrieves the *create* events that happened from the very beginning to a given time (inclusive).
    * 
    * @param qx a given Qx queue (Either {@link Tx} or {@link Rx})
    * @param time a time until which the create events happened
    * @param true if events should be temporally considered in a inclusive maner, false otherwise 
    * @param kindsToRetrieve a collection of kinds to retrieve among (RX_ADDED, RX_REMOVED, TX_ADDED, TX_REMOVED)
    * 
    * @return a list of {@link Event} corresponding to given time and queue parameters
    */
    public <T extends Qx> List<Event> getEventsToGivenTime(final T qx, long time, boolean inclusive, EVENT_KIND... kindsToRetrieve) {
    	return getEventsWithinGivenTimeRange(qx, Long.MIN_VALUE, time, true, inclusive, kindsToRetrieve);
    }
    
    //
    // From a given time
    //
    
    // Create
    /**
     * Specifically retrieves the *create* events that happened from the very beginning to a given time (inclusive).
     * 
     * @param qx a given Qx queue (Either {@link Tx} or {@link Rx})
     * @param time a time from which the create events happened
     * 
     * @return a list of {@link Event} corresponding to given time and queue parameters
     */
    public <T extends Qx> List<Event> getCreateEventsFromGivenTime(final T qx, long time) {
    	return getCreateEventsFromGivenTime(qx, time, true);
    }
    
    /**
     * Specifically retrieves the *create* events that happened from the very beginning to a given time.
     * 
     * @param qx a given Qx queue (Either {@link Tx} or {@link Rx})
     * @param time a time from which the create events happened
     * @param true if events should be temporally considered in a inclusive maner, false otherwise 
     * 
     * @return a list of {@link Event} corresponding to given time and queue parameters
     */
    public <T extends Qx> List<Event> getCreateEventsFromGivenTime(final T qx, long time, boolean inclusive) {
    	return getEventsFromGivenTime(qx, time, inclusive, qx instanceof Rx ? EVENT_KIND.RX_READY : EVENT_KIND.TX_READY);
    }

    // Delete
    /**
     * Specifically retrieves the *delete* events that happened from a given time until now.
     * 
     * @param qx a given Qx queue (Either {@link Tx} or {@link Rx})
     * @param time a time from which the create events happened
     * 
     * @return a list of {@link Event} corresponding to given time and queue parameters
     */
    public <T extends Qx> List<Event> getDeleteEventsFromGivenTime(final T qx, long time) {
    	return getCreateEventsFromGivenTime(qx, time, true);
    }
    
    /**
     * Specifically retrieves the *delete* events that happened from a given time until now.
     * 
     * @param qx a given Qx queue (Either {@link Tx} or {@link Rx})
     * @param time a time from which the create events happened
     * @param true if events should be temporally considered in a inclusive maner, false otherwise 
     * 
     * @return a list of {@link Event} corresponding to given time and queue parameters
     */
    public <T extends Qx> List<Event> getDeleteEventsFromGivenTime(final T qx, long time, boolean inclusive) {
    	return getEventsFromGivenTime(qx, time, inclusive, qx instanceof Rx ? EVENT_KIND.RX_DONE : EVENT_KIND.TX_DONE);
    }

    // All
    /**
     * Specifically retrieves *all* events that happened from a given time until now.
     * 
     * @param qx a given Qx queue (Either {@link Tx} or {@link Rx})
     * @param time a time from which the create events happened
     * 
     * @return a list of {@link Event} corresponding to given time and queue parameters
     */
    public <T extends Qx> List<Event> getEventsFromGivenTime(final T qx, long time) {
    	return getEventsFromGivenTime(qx, time, true);
    }

    /**
     * Specifically retrieves *all* events that happened from a given time until now.
     * 
     * @param qx a given Qx queue (Either {@link Tx} or {@link Rx})
     * @param time a time from which the create events happened
     * @param true if events should be temporally considered in a inclusive maner, false otherwise 
     * 
     * @return a list of {@link Event} corresponding to given time and queue parameters
     */
    public <T extends Qx> List<Event> getEventsFromGivenTime(final T qx, long time, boolean inclusive) {
    	return getEventsFromGivenTime(
    		qx, 
    		time, 
    		inclusive, 
    		qx instanceof Rx ? new EVENT_KIND[] { EVENT_KIND.RX_DONE, EVENT_KIND.RX_READY} : 
    			new EVENT_KIND[] { EVENT_KIND.TX_DONE, EVENT_KIND.TX_READY }
    	);
    }
    
    /**
     * Specifically retrieves *all* events that happened from a given time until now.
     * 
     * @param qx a given Qx queue (Either {@link Tx} or {@link Rx})
     * @param time a time from which the create events happened
     * @param true if events should be temporally considered in a inclusive maner, false otherwise 
     * @param kindsToRetrieve a collection of kinds to retrieve among (RX_ADDED, RX_REMOVED, TX_ADDED, TX_REMOVED)
     * 
     * @return a list of {@link Event} corresponding to given time and queue parameters
     */
    public <T extends Qx> List<Event> getEventsFromGivenTime(final T qx, long time, boolean inclusive, EVENT_KIND... kindsToRetrieve) {
    	return getEventsWithinGivenTimeRange(qx, time, Long.MAX_VALUE, inclusive, true, kindsToRetrieve);
    }

    //
    // Not Temporal + General
    //
    
    /**
     * Generically retrieves the events from a given Qx (Either {@link Tx} or {@link Rx}).
     * 
     * @param qx a given Qx queue
     * @param kindsToRetrieve {@link EVENT_KIND} events kind(s) to retrieve
     * 
     * @return a list of compatible {@link Event} corresponding to given parameters, a void list otherwise
     */
    public List<Event> getEvents(final Qx qx, EVENT_KIND... kindsToRetrieve) {
        List<Event> lst = new ArrayList<Event>();
        List<EVENT_KIND> kinds = Arrays.asList(kindsToRetrieve);
        
        boolean txDone  = kinds.contains(EVENT_KIND.TX_DONE);
        boolean txReady = kinds.contains(EVENT_KIND.TX_READY);
        boolean rxDone  = kinds.contains(EVENT_KIND.RX_DONE);
        boolean rxReady = kinds.contains(EVENT_KIND.RX_READY);
        
        for (Object evt : ((CmdPipe) qx.eContainer()).getRxEvents()) {
            if (((Event)evt).getQx().equals(qx)) {
            	if (rxDone && ((Event)evt).getKind().equals(EVENT_KIND.RX_DONE)) {
            		lst.add(((Event)evt));
            	} else if (rxReady && ((Event)evt).getKind().equals(EVENT_KIND.RX_READY)) {
            		lst.add(((Event)evt));
            	}
            }
        }
        
        for (Object evt : ((CmdPipe) qx.eContainer()).getTxEvents()) {
            if (((Event)evt).getQx().equals(qx)) {
               	if (txDone && ((Event)evt).getKind().equals(EVENT_KIND.TX_DONE)) {
            		lst.add(((Event)evt));
            	} else if (txReady && ((Event)evt).getKind().equals(EVENT_KIND.TX_READY)) {
            		lst.add(((Event)evt));
            	}
            }
        }
        
        return lst;
    }
    
    //
    // Not temporal + Specific
    //
    /**
     * Generically retrieves all events from a given Qx (Either {@link Tx} or {@link Rx}).
     * 
     * @return a list of all compatible {@link Event} corresponding to given parameters, a void list otherwise
     */
    public List<Event> getAllEvents(final Qx qx) {
        return getEvents(
        	qx, 
        	qx instanceof Rx ? new EVENT_KIND[] { EVENT_KIND.RX_DONE, EVENT_KIND.RX_READY} : 
        		new EVENT_KIND[] { EVENT_KIND.TX_DONE, EVENT_KIND.TX_READY } 
        );
    }
    
    /**
     * Generically retrieves *create* events from a given Qx (Either {@link Tx} or {@link Rx}).
     * 
     * @return a list of all compatible {@link Event} corresponding to given parameters, a void list otherwise
     */
    public List<Event> getCreateEvents(final Qx qx) {
         return getEvents(qx, qx instanceof Rx ? EVENT_KIND.RX_DONE : EVENT_KIND.TX_DONE);
    }
    
    /**
     * Generically retrieves *delete* events from a given Qx (Either {@link Tx} or {@link Rx}).
     * 
     * @return a list of all compatible {@link Event} corresponding to given parameters, a void list otherwise
     */
    public List<Event> getDeleteEvents(final Qx qx) {
        return getEvents(qx, qx instanceof Rx ? EVENT_KIND.RX_READY : EVENT_KIND.TX_READY);
    }

    //
    // ...
    //
    /**
     * Generically retrieves *Qx* queues from a given {@link CmdPipe} reference.
     * 
     * @return a list of all compatible {@link Qx} queues to given parameters, a void list otherwise
     */
   public Collection<Qx> getXxQueues(final CmdPipe engine, EClass qxSubType) {
        final EObjectTypeRelationCondition condition = 
            new EObjectTypeRelationCondition(
                qxSubType,
                TypeRelation.SAMETYPE_LITERAL
            );        
        IQueryResult result = null;
        try {
            result = (IQueryResult) qxTransactionalEditingDomain.runExclusive(
            	new RunnableWithResult.Impl<IQueryResult>() {
            		public void run() {
            			setResult(new SELECT(
            				new FROM(engine.getQueues()),
            				new WHERE(condition)
            			).execute());
            		}
            	}
            );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (result != null && !result.isEmpty()) {
            return Arrays.asList(result.getEObjects().toArray(new Qx[0]));
        }
        return Collections.emptySet();
    }
    
    //
    // Rx
    //
   /**
    * Specifically retrieves *Rx* queues from a given {@link CmdPipe} reference.
    * 
    * @return a list of all compatible {@link Rx} queues to given parameters, a void list otherwise
    */
    public Collection<Rx> getRxQueues(CmdPipe engine) {
        return Arrays.asList(getXxQueues(engine, EnginePackage.Literals.RX).toArray(new Rx[0]));
    }
    
    //
    // Tx
    //
    /**
     * Specifically retrieves *Tx* queues from a given {@link CmdPipe} reference.
     * 
     * @return a list of all compatible {@link Tx} queues to given parameters, a void list otherwise
     */
    public Collection<Tx> getTxQueues(CmdPipe engine) {
        return Arrays.asList(getXxQueues(engine, EnginePackage.Literals.TX).toArray(new Tx[0]));
    }
    
    /**
     * Getter for the currently considered transactional editing domain.
     * 
     * @return currently considered transactional editing domain. Null is definitely a FATAL error at this stage !!!
     */
    public TransactionalEditingDomain getQxTransactionalEditingDomain() {
        return qxTransactionalEditingDomain;
    }
   
    public synchronized Cmd syncSend(Cmd cmd, Qx qx) {
    	return syncSend(cmd, qx, 10000l);
    }
    
    public synchronized Cmd syncSend(final Cmd cmd, final Qx tx, final long duration) {
    	final CmdPipe pipe = (CmdPipe) tx.eContainer();
    	
    	try {
	    	qxSyncRunner.setParameters(pipe.getTx(), pipe.getRx(), cmd, duration);
	    	qxTransactionalEditingDomain.runExclusive(
	    	    qxSyncRunner
	    	);
    	} catch (InterruptedException ie) {
    		ie.printStackTrace();
    	}
    		
		return qxSyncRunner.getResult();
    }

	class QxSyncRunnable<T extends Cmd> implements RunnableWithResult<T> {
		private Qx tx;
		@SuppressWarnings("unused")
		private Qx rx;
		private Cmd cmd;
		private T lastCmd;
		private long duration;
		public void setParameters(Qx t, Qx r, Cmd c, long delay) {
			tx			= t;
			rx			= r;
			cmd 		= c;
			duration	= delay;
			lastCmd		= null;
		}
		@SuppressWarnings("unchecked")
		@Override
		public void run() {
			CmdPipe pipe = (CmdPipe) tx.getEngine();
			
			pipe.send(cmd);
			
			IChannel channel = tx.getEngine().getPort().getChannel();
			
			long stop = System.currentTimeMillis() + duration;
			long present = System.currentTimeMillis();
			while (present < stop) {
				present = System.currentTimeMillis();
				if (channel != null) {
					if (channel.getLastFrame() != null) {
						lastCmd = (T) pipe.getInputInterpreter().byteArray2Cmd(channel.getLastFrame());
						break;
					}
				}
			}
			channel.setLastFrame(null);
		}
		@Override
		public IStatus getStatus() {
			return Status.OK_STATUS;
		}
		@Override
		public void setStatus(IStatus arg0) {
			
		}
		@Override
		public T getResult() {
			return lastCmd;
		}
	}
    
    class QxRunnable<T extends Cmd> implements Runnable {
    	private Qx queue;
    	private T cmd;
    	public void setParameters(Qx q, T c) {
    		queue	= q;
    		cmd		= c;
    	}
    	@Override
    	public void run() {
			int size = getQueueSize(queue.getCommands());
			if (queue.getMax()<size) {
				if (Platform.inDebugMode()) {
					System.out.println("THRESHOLD " + queue.getMax() + " RAISED !!!");
				}
				int idx = queue.getMax() - queue.getMax()/4;
				idx = idx > 0 ? idx : 1;
				idx = idx >= queue.getCommands().size() ? queue.getCommands().size() - 1 : idx;
				List<Cmd> lst = queue.getCommands().subList(
					0, 
					idx
				);
				queue.eSetDeliver(false);
				queue.getCommands().removeAll(lst);
				queue.eSetDeliver(false);
			}
			
			cmd.setStamp(System.currentTimeMillis());

			if (queue.getCommands().size() > 1) {
				for (int i=queue.getCommands().size()-1; i>0; i--) {
					Cmd c = queue.getCommands().get(i);
					long delay = System.currentTimeMillis() - c.getStamp();
					if (queue.getTtl() < delay) {
						if (Platform.inDebugMode()) {
							System.out.println("Cmd FLUSH BECAUSE OF delay over TTL : " + delay + " > "+ queue.getTtl());
						}
						queue.eSetDeliver(false);
						int idx = queue.getCommands().indexOf(c);
						queue.getCommands().removeAll(
							queue.getCommands().subList(
								0,
								idx < 1 ? 1 : idx -1 
							)
						);
						queue.eSetDeliver(true);
						break;
					}
				}
			} else if (!queue.getCommands().isEmpty()) {
				Cmd c = queue.getCommands().get(0);
				long delay = System.currentTimeMillis() - c.getStamp();
				if (queue.getTtl() < delay) {
					if (Platform.inDebugMode()) {
						System.out.println(queue.eClass().getName() + " Cmd FLUSH BECAUSE OF delay over TTL : " + delay + " > "+ queue.getTtl());
					}
					queue.eSetDeliver(false);
					queue.getCommands().remove(0);
					queue.eSetDeliver(true);
				}
			}
			
			queue.getCommands().add(cmd);
			
			if (Platform.inDebugMode()) {
				System.out.println(queue.eClass().getName() + " Cmd queue size : " + size);
			}
    	}
    }
    
    /**
     * Send a Command to a given {@link Qx} queue.
     * 
     * @param <T> a Cmd subclass
     * @param queue a given {@link Qx} queue
     * @param cmd a {@link Cmd} to send to a {@link Qx} queue
     * 
     * @return the {@link Cmd} sent
     */
    public synchronized <T extends Cmd> T sendCmd(final Qx queue, final T cmd) {
    	if (queue != null && cmd != null) {
    		try {
    			qxRunner.setParameters(queue, cmd);
				qxTransactionalEditingDomain.runExclusive(
					qxRunner
				);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	}
        return cmd;
    }

    /**
     * Send a randomly created {@link Cmd} to the given queue
     * 
     * @param queue a given Qx queue to send the randomly created {@link Cmd}
     * 
     * @return the randomly created {@link Cmd}
     */
    public Cmd sendRandomCmd(Qx queue) {
    	return sendCmd(queue, CmdUtil.INSTANCE.generateRamdomCmd());
    }
    
    //
    // Very likely to be Safe ... isn't it ?
    //
    /**
     * Get the highest {@link PRIORITY} level from all existing {@link Cmd} list from a given {@link Qx} queue
     * 
     * @param tx a given Qx queue to send the randomly created {@link Cmd}
     * 
     * @return the highest {@link PRIORITY} level from all existing {@link Cmd} list
     */
    public PRIORITY getHighestPriorityCmdFromQueue(final Qx qx) {
        PRIORITY priority = PRIORITY.LOWEST;
        try {
            priority = (PRIORITY) qxTransactionalEditingDomain.runExclusive(
            	new RunnableWithResult.Impl<PRIORITY>() {
            		public void run() {
            			PRIORITY priority = PRIORITY.LOWEST;
            			for (Cmd c : qx.getCommands()) {
            				if (c.getPriority().compareTo(priority) > 0) {
            					priority = c.getPriority();
            				}
            			}
            			setResult(priority);
            		}
            	}
            );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return priority;
    }
    
    /**
     * Get the oldest {@link Cmd} command with most urgent {@link PRIORITY} level from all existing {@link Cmd} list from a given {@link Qx} queue
     * 
     * @param tx a given Qx queue to send the randomly created {@link Cmd}
     * 
     * @return the oldest {@link Cmd} command with most urgent {@link PRIORITY} level
     */
    public Cmd consumeOldestMostUrgentCmd(final Qx qx) {
        Cmd cmd = null;
        try {
            cmd = (Cmd) qxTransactionalEditingDomain.runExclusive(
            	new RunnableWithResult.Impl<Cmd>() {
            		public void run() {
            			PRIORITY priority = getHighestPriorityCmdFromQueue(qx);
            			for (Cmd c : qx.getCommands())  {
            				if (c.getPriority().equals(priority)) {
            					setResult(c);
            					break;
            				}
            			}
            			qx.getCommands().remove(getResult());
            		}
            	}
            );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return cmd;
    }
    
    /**
     * Get the oldest {@link Cmd} command with most urgent {@link PRIORITY} level from all existing {@link Cmd} list from a given {@link Qx} queue
     * 
     * @param tx a given Qx queue to send the randomly created {@link Cmd}
     * 
     * @return the oldest {@link Cmd} command with most urgent {@link PRIORITY} level
     */
    public Cmd consumeNewestMostUrgentCmd(final Qx qx) {
        Cmd cmd = null;
        try {
            cmd = (Cmd) qxTransactionalEditingDomain.runExclusive(
            	new RunnableWithResult.Impl<Cmd>() {
            		public void run() {
            			PRIORITY priority = getHighestPriorityCmdFromQueue(qx);
            			for (Cmd c : qx.getCommands())  {
            				if (c.getPriority().equals(priority)) {
            					setResult(c);
            					break;
            				}
            			}
            			qx.getCommands().clear();
            		}
            	}
            );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return cmd;
    }
    
    public int getEventQueueSize(Event e) {
    	return !(e.getCmd() instanceof CompoundCmd) ? 1 : getEventQueueSize(Arrays.asList(new Event[] {e}));
    }
    
    public int getEventQueueSize(List<Event> lst) {
    	int ret = lst.size(); 
    	for (Event e : lst) {
    		if (e.getCmd() instanceof CompoundCmd) {
    			 ret += getQueueSize(((CompoundCmd)e.getCmd()).getChildren());
    		}
    	}
    	return ret;
    }
    
    public int getQueueSize(Cmd cmd) {
    	if (cmd instanceof CompoundCmd) {
    		return getQueueSize(((CompoundCmd)cmd).getChildren());
    	}
    	return 1;
    }
    
    public int getQueueSize(List<Cmd> lst) {
    	int ret = lst.size(); 
    	for (Cmd c : lst) {
    		if (c instanceof CompoundCmd) {
    			 ret += getQueueSize(((CompoundCmd)c).getChildren());
    		}
    	}
    	return ret;
    }
    
    /**
     * Get the oldest {@link Cmd} command with most urgent {@link PRIORITY} level from all existing {@link Cmd} list from a given {@link Qx} queue
     * 
     * @param tx a given Qx queue to send the randomly created {@link Cmd}
     * 
     * @return the oldest {@link Cmd} command with most urgent {@link PRIORITY} level
     */
    public Cmd consumeNewestAndFlushCmd(final Qx qx) {
        try {
        	return (Cmd) qxTransactionalEditingDomain.runExclusive(
            	new RunnableWithResult.Impl<Cmd>() {
            		public void run() {
            			int size = getQueueSize(qx.getCommands());
	            		if (size > 0) {
							if (qx.getMax() < size) {
								if (Platform.inDebugMode()) {
									System.out.println("THRESHOLD " + qx.eClass().getName() + " of "+ qx.getMax() + " RAISED !!!");
								}
								int idx = qx.getMax() - qx.getMax() / 4;
								idx = idx > 0 ? idx : 1;
								idx = idx >= qx.getCommands().size() ? qx.getCommands().size() - 1 : idx;
								List<Cmd> lst = qx.getCommands().subList(
									0, 
									idx
								);
								qx.eSetDeliver(false);
								qx.getCommands().removeAll(lst);
								qx.eSetDeliver(true);
							}
								
							if (size > 1) {
								for (int i=qx.getCommands().size()-1; i>0; i--) {
									Cmd c = qx.getCommands().get(i);
									long delay = System.currentTimeMillis() - c.getStamp();
									if (qx.getTtl() < delay) {
										if (Platform.inDebugMode()) {
											System.out.println(qx.eClass().getName() +  " Cmd FLUSH BECAUSE OF delay over TTL : " + delay + " > "+ qx.getTtl());
										}
										qx.eSetDeliver(false);
										int idx = qx.getCommands().indexOf(c);
										qx.getCommands().removeAll(
											qx.getCommands().subList(
												0,
												idx < 1 ? 1 : idx -1 
											)
										);
										qx.eSetDeliver(true);
										break;
									}
								}
							} else if (!qx.getCommands().isEmpty()) {
								Cmd c = qx.getCommands().get(0);
								
								long delay = System.currentTimeMillis() - c.getStamp();
								if (qx.getTtl() < delay) {
									if (Platform.inDebugMode()) {
										System.out.println(qx.eClass().getName() + " Cmd FLUSH BECAUSE OF delay over TTL : " + delay + " > "+ qx.getTtl());
									}
									qx.eSetDeliver(false);
									qx.getCommands().remove(0);
									qx.eSetDeliver(true);
								}
							}
								
							if (Platform.inDebugMode()) {
								System.out.println(qx.eClass().getName() + " Cmd queue size : " + size);
							}
							
							if (!qx.getCommands().isEmpty()) {
								qx.eSetDeliver(false);
								setResult(qx.getCommands().remove(0));
								qx.eSetDeliver(true);
							}
	            		}
            		}
            	}
            );
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    /**
     * Consumes the oldest {@link Cmd} command with most urgent {@link PRIORITY} level from all existing {@link Cmd} list from a given {@link Qx} queue
     * 
     * @param qx a given Qx queue to send the randomly created {@link Cmd}
     * @param strategy a given {@link QxProcessingStrategy} queue to choose a behavior for {@link Cmd} consumption
     * 
     * @return the oldest {@link Cmd} command with most urgent {@link PRIORITY} level consumed
     */
    public Cmd consumeCmd(Qx qx) {
    	switch(qx.getStrategy()) {
	    	case OLDEST_MOST_URGENT:
//	        	return consumeOldestMostUrgentCmd(qx);
	    	case PICK_NFLUSH:
	    	case NEWEST_MOST_URGENT:
//	    		return consumeNewestMostUrgentCmd(qx);
	    	case PREDICATE:
	    	case ROUND_ROBIN:
	    	case TIME_RANGE_EXCLUSIVE:
	    	case TIME_RANGE_INCLUSIVE:
	        default:
	        	return consumeNewestAndFlushCmd(qx);
//	        	return consumeOldestMostUrgentCmd(qx);
    	}
    }
    
    
    
    public CmdPipe createSimpleCmdEngine(String engineID) {
    	return createSimpleCmdEngine(engineID, QxMonitorJob.DEFAULT_SPEED);
    }
    
    public CmdPipe createSimpleCmdEngine(String engineID, long speed) {
        EngineClient engineClient = (EngineClient) EcoreUtil.create(EnginePackage.Literals.ENGINE_CLIENT);
        engineClient.setId(engineID);

        CmdPipe engine = (CmdPipe) EcoreUtil.create(EnginePackage.Literals.CMD_PIPE); 
        engine.setClient(engineClient);
        engine.setId("Engine " + engineID);
		engineClient.getEngines().add(engine);
		engineClient.setRunner(new QxMonitorJob(engine, speed));
		
        for (Adapter adapter : engine.eAdapters()) {
        	if (adapter instanceof QxEventAdapterImpl) {
        		((QxEventAdapterImpl)adapter).getEvtHandlers().clear();
        	}
        }
        engine.eAdapters().add(new QxAdapterImpl(engine));
        
        Rx rxq = EngineFactory.eINSTANCE.createRx();
        engine.getQueues().add(rxq);
        engine.setRx(rxq);

        Tx txq = EngineFactory.eINSTANCE.createTx();
        engine.getQueues().add(txq);
        engine.setTx(txq);

        return engine;
    }
}
