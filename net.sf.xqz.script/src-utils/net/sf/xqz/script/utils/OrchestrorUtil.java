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

package net.sf.xqz.script.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.xqz.engine.cmd.clients.QxMonitorJob;
import net.sf.xqz.engine.interpret.cmd.NullXCmdInterpreter;
import net.sf.xqz.engine.orchestror.utils.OrcherstrorClockJob;
import net.sf.xqz.engine.queues.QxAdapterImpl;
import net.sf.xqz.engine.script.orchestror.DSLCommandEngine;
import net.sf.xqz.engine.script.orchestror.DSLEngineClient;
import net.sf.xqz.engine.script.orchestror.DSLOrchestror;
import net.sf.xqz.engine.script.orchestror.DSLRate;
import net.sf.xqz.engine.script.orchestror.DSLStrategy;
import net.sf.xqz.model.cmd.PRIORITY;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EngineApplication;
import net.sf.xqz.model.engine.EngineClient;
import net.sf.xqz.model.engine.EnginePackage;
import net.sf.xqz.model.engine.QxProcessingStrategy;
import net.sf.xqz.model.engine.Rx;
import net.sf.xqz.model.engine.Tx;
import net.sf.xqz.model.temporal.Orchestror;
import net.sf.xqz.model.temporal.TemporalPackage;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class OrchestrorUtil {
	List<Orchestror> orchestrorRegistry;
	
	public final static OrchestrorUtil INSTANCE = new OrchestrorUtil();
	
	public OrchestrorUtil() {
		orchestrorRegistry = new ArrayList<Orchestror>();
	}
	/*
	private Injector injector;
	
	@Inject
	public OrchestrorUtil() {
		OrchestrorStandaloneSetup.doSetup();
		injector = Guice.createInjector(new OrchestrorRuntimeModule());
		orchestrorRegistry = new ArrayList<Orchestror>();
	}	
	*/
	
	/*
	public EObject getModel3(String pathname) throws IOException {
		return getModel2(URI.createURI(pathname));
	}

	public EObject getModel2(URI uri) throws IOException {
		XtextResourceSet set = injector.getInstance(XtextResourceSet.class);
		set.setClasspathURIContext(getClass());
		set.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = set.getResource(uri, true);
		return resource.getContents().get(0);
	}
	
	public URI saveModel2(DSLOrchestror orchetror, String pathname) throws IOException {
		URI uri = URI.createURI(pathname);
		saveModel(orchetror, uri);
		return uri;
	}
	
	public void saveModel(DSLOrchestror orchetror, URI uri) throws IOException {
		XtextResourceSet set = injector.getInstance(XtextResourceSet.class);
		set.setClasspathURIContext(getClass());
		set.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = set.getResource(uri, true);
		resource.getContents().add(orchetror);
		resource.save(new HashMap<Object, Object>());
	}
	public Orchestror loadOrchestror(String pathname) {
		try {
			return buildOrchestror((DSLOrchestror) getModel3(pathname));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Orchestror loadOrchestror(URI uri) {
		try {
			return buildOrchestror((DSLOrchestror) getModel2(uri));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		try {
			Injector injector = Guice.createInjector(new OrchestrorUtilsModule());
			OrchestrorUtil orchestrorUtil = (OrchestrorUtil) injector.getInstance(IOrchestrorUtils.class);
			Orchestror orchestror = orchestrorUtil.loadOrchestror(new File("data/test.orchestror").getCanonicalPath());
			orchestror.getClass();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	 */
	
	public List<Orchestror> getOrchestrorRegistry() {
		return orchestrorRegistry;
	}
	
	public Orchestror createOrchestrorAndInitWithApp(EngineApplication app) {
		Orchestror orchestror = (Orchestror) EcoreUtil.create(TemporalPackage.Literals.ORCHESTROR);
		orchestror.setApplication(app);
		orchestror.setId("Orchestror_" + app.getId());
		orchestror.setName("Orchestror "+ app.getName());
		orchestrorRegistry.add(orchestror);
		return orchestror;
	}
	
	
	public Orchestror buildOrchestror(DSLOrchestror dslOrchestror) {
		EngineApplication app = (EngineApplication) EcoreUtil.create(EnginePackage.Literals.ENGINE_APPLICATION);
		app.setId(dslOrchestror.getName()+"App");
		app.setName("Application " + dslOrchestror.getName()+"App");

		Orchestror orchestror = (Orchestror) EcoreUtil.create(TemporalPackage.Literals.ORCHESTROR);

	    OrcherstrorClockJob clock = new OrcherstrorClockJob(orchestror);
	    clock.setPriority(Job.INTERACTIVE);

		orchestror.setClock(clock);
		orchestror.setApplication(app);
		orchestror.setId(dslOrchestror.getName());
		orchestror.setName("Orchestror "+ dslOrchestror.getName());
		
		Map<String, CmdPipe> cmdEngineMap = new HashMap<String, CmdPipe>();
		for (DSLCommandEngine e: dslOrchestror.getEngines()) {
			CmdPipe engine = (CmdPipe) EcoreUtil.create(EnginePackage.Literals.CMD_PIPE);
			engine.setApplication(app);
			engine.setId(e.getName());
			engine.setName("Engine " + e.getName());
			engine.setOutputInterpreter(new NullXCmdInterpreter());
	        engine.eAdapters().add(new QxAdapterImpl(engine));
	        
			cmdEngineMap.put(e.getName(), engine);
			
			Rx rx = (Rx) EcoreUtil.create(EnginePackage.Literals.RX);
			rx.setEngine(engine);
			rx.setStrategy(getStrategy(e.getStrategy()));
			rx.setCurrentMaxPriority(PRIORITY.HIGHEST);
			rx.setThreshold(e.getThreshold()/100f);
			rx.setTtl(e.getTtl());
			engine.setRx(rx);
			
			Tx tx = (Tx) EcoreUtil.create(EnginePackage.Literals.TX);
			tx.setEngine(engine);
			tx.setStrategy(getStrategy(e.getStrategy()));
			tx.setCurrentMaxPriority(PRIORITY.HIGHEST);
			tx.setThreshold(e.getThreshold()/100f);
			tx.setTtl(e.getTtl());
			engine.setTx(tx);
			
			engine.getQueues().add(rx);
			engine.getQueues().add(tx);

			app.getEngine().add(engine);
		}
		
		Map<String, EngineClient> engineClientMap = new HashMap<String, EngineClient>();
		for (DSLEngineClient c : dslOrchestror.getClients()) {
            EngineClient engineClient = (EngineClient) EcoreUtil.create(EnginePackage.Literals.ENGINE_CLIENT);
            engineClient.setId(c.getName());
            engineClient.setName("Client " + c.getName());
            engineClient.setApplication(app);
            engineClientMap.put(c.getName(), engineClient);
            long clientSpeed = getSpeed(c.getSpeed());
            
            for (DSLCommandEngine e : c.getRefCmdEngines()) {
				if (cmdEngineMap.containsKey(e.getName())) {
					CmdPipe cmdEngine = cmdEngineMap.get(e.getName());
					cmdEngine.setClient(engineClient);
					engineClient.getEngines().add(cmdEngine);
					long engineSpeed = getSpeed(e.getSpeed());
					engineSpeed = clientSpeed > engineSpeed ? engineSpeed : clientSpeed;
					engineClient.setRunner(new QxMonitorJob(cmdEngine, engineSpeed));
				}
            }
            app.getClients().add(engineClient);
		}
		
		orchestrorRegistry.add(orchestror);
		
		return orchestror;
	}
	
	private QxProcessingStrategy getStrategy(DSLStrategy strategy) {
		switch(strategy) {
			case TIME_RANGE_EXCLUSIVE:
				return QxProcessingStrategy.TIME_RANGE_EXCLUSIVE;
			case TIME_RANGE_INCLUSIVE:
				return QxProcessingStrategy.TIME_RANGE_INCLUSIVE;
			case ROUN_ROBIN:
				return QxProcessingStrategy.ROUND_ROBIN;
			case PREDICATE:
				return QxProcessingStrategy.PREDICATE;
			case PICK_NRUSH:
				return QxProcessingStrategy.PICK_NFLUSH;
			case OLDEST_MOST_URGENT:
				return QxProcessingStrategy.OLDEST_MOST_URGENT;
			case NEWEST_MOST_URGENT:
				return QxProcessingStrategy.NEWEST_MOST_URGENT;
		}
		return QxProcessingStrategy.OLDEST_MOST_URGENT;
	}
	
	private long getSpeed(DSLRate rate) {
		long speed = 250;
		if (rate != null) {
			switch (rate) {		
				case MAX:
					speed = 25;
					break;
				case VERY_FAST:
					speed = 75;
					break;
				case FAST:
					speed = 175;
					break;
				case AVERAGE:
					speed = 250;
					break;
				case SLOW:
					speed = 375;
					break;
				case VERY_SLOW:
					speed = 500;
					break;
				case MIN:
					speed = 1000;
					break;
				default:
					break;
			}
		}
		return speed;
	}
}
