/***********************************************************************************
 * Cross Queues - A Model driven I/O queues utilities framework 
 * 
 * Copyright (c) 2012, Lucas Bigeardel
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

package net.sf.xqz.engine.cep;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Enumeration;

import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseConfiguration;
import org.drools.KnowledgeBaseFactory;
import org.drools.agent.KnowledgeAgent;
import org.drools.agent.KnowledgeAgentFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.conf.EventProcessingOption;
import org.drools.conf.MaxThreadsOption;
import org.drools.conf.MultithreadEvaluationOption;
import org.drools.io.ResourceFactory;
import org.drools.runtime.KnowledgeSessionConfiguration;
import org.drools.runtime.StatefulKnowledgeSession;
import org.drools.runtime.conf.ClockTypeOption;
import org.drools.runtime.rule.WorkingMemoryEntryPoint;
import org.eclipse.core.runtime.FileLocator;
import org.osgi.framework.Bundle;

public class GlobalCmdEventHandler extends AbstractQxEventHandlerImpl{
	KnowledgeBaseConfiguration kBaseconfig;
	KnowledgeSessionConfiguration kSessionConfig;
	KnowledgeBase kBase;
	KnowledgeBuilder kBuilder;
	KnowledgeAgent kAgent;
	StatefulKnowledgeSession sKnowledgeSession;
	WorkingMemoryEntryPoint globalQxEntryPoint;
	public GlobalCmdEventHandler() {
		kSessionConfig = KnowledgeBaseFactory.newKnowledgeSessionConfiguration();
		kSessionConfig.setOption( ClockTypeOption.get("realtime") );

		kBaseconfig	= KnowledgeBaseFactory.newKnowledgeBaseConfiguration();
		kBaseconfig.setOption(EventProcessingOption.STREAM);
		kBaseconfig.setOption( MultithreadEvaluationOption.YES );
		kBaseconfig.setOption( MaxThreadsOption.get(5) );
		
		kBase	= KnowledgeBaseFactory.newKnowledgeBase("Global XQZ KBase");
		kAgent	= KnowledgeAgentFactory.newKnowledgeAgent("Global XQZ KAgent", kBase);
		kBuilder = KnowledgeBuilderFactory.newKnowledgeBuilder(kBase);
		
		
		Bundle bundle = Activator.getDefault().getBundle();

		Enumeration<URL> rules = bundle.findEntries("/rules", "*.drl", true);
		
		while (rules.hasMoreElements()) {
			URL url = rules.nextElement();
			try {
				File file = null;
				try {
				    file = new File(FileLocator.resolve(url).toURI());
				} catch (URISyntaxException e1) {
				    e1.printStackTrace();
				} catch (IOException e1) {
				    e1.printStackTrace();
				}
				String fileName = file.getCanonicalPath();
				kBuilder.add(ResourceFactory.newFileResource(fileName), ResourceType.DRL);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (kBuilder.hasErrors()) {
			System.err.println(kBuilder.getErrors().toString());
		}
		
		kBase.addKnowledgePackages(kBuilder.getKnowledgePackages());
		
		sKnowledgeSession = kBase.newStatefulKnowledgeSession();
	}
	@Override
	public synchronized void handleQxEvent(Event event) {
		if (event.getKind() == EVENT_KIND.RX_DONE || event.getKind() == EVENT_KIND.TX_DONE) {
			sKnowledgeSession.insert(event);
			sKnowledgeSession.fireAllRules();
		}
	}
	public KnowledgeBuilder getkBuilder() {
		return kBuilder;
	}
	public WorkingMemoryEntryPoint getGlobalQxEntryPoint() {
		return globalQxEntryPoint;
	}
	public KnowledgeAgent getkAgent() {
		return kAgent;
	}
	public KnowledgeBase getkBase() {
		return kBase;
	}
	public KnowledgeBaseConfiguration getkBaseconfig() {
		return kBaseconfig;
	}
	public KnowledgeSessionConfiguration getkSessionConfig() {
		return kSessionConfig;
	}
	public StatefulKnowledgeSession getsKnowledgeSession() {
		return sKnowledgeSession;
	}
}
