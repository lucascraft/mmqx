/***********************************************************************************
 * Cross Queues - A Model driven I/O queues utilities framework 
 * 
 * Copyright (c) 2008 - 2010, Lucas Bigeardel
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

package net.sf.xqz.engine.cdo;


public class CDOToolkit {
//	private CDOResource resource;
//	private CDOSession session;
//	private IManagedContainer container;
//	private IConnector connector;
//	private CDOTransaction transaction;
//	
//	public static CDOToolkit INSTANCE = new CDOToolkit();
//	public CDOToolkit() {
//		initCmdEngineCDOResource();
//	}
//	public CDOResource getCDOResource() {
//		return resource;
//	}
//	private CDOResource initCmdEngineCDOResource(){
//	    // Enable logging and tracing
//	    OMPlatform.INSTANCE.setDebugging(true);
//	    OMPlatform.INSTANCE.addLogHandler(PrintLogHandler.CONSOLE);
//	    OMPlatform.INSTANCE.addTraceHandler(PrintTraceHandler.CONSOLE);
//	
//	    // Prepare container
//	    container = ContainerUtil.createContainer();
//	    Net4jUtil.prepareContainer(container); // Register Net4j factories
//	    TCPUtil.prepareContainer(container); // Register TCP factories
//	    //CDOUtil.prepareContainer(container); // Register CDO factories
//	    //container.activate();
//	
//	    // Create connector
//	    connector = TCPUtil.getConnector(container, "localhost:2036");
//	
//	    // Create configuration
//	    CDOSessionConfiguration configuration = CDOUtil.createSessionConfiguration();
//	    configuration.setConnector(connector);
//	    configuration.setRepositoryName("SAQxCDORepository");
//	
//	    // Open session
//	    session = configuration.openSession();
//	    
//	    session.getPackageRegistry().putEPackage(EnginePackage.eINSTANCE);
//	    session.getPackageRegistry().putEPackage(CmdPackage.eINSTANCE);
//	    session.getPackageRegistry().putEPackage(TemporalPackage.eINSTANCE);
//	
//	    // Open transaction
//	    transaction = session.openTransaction();
//	
//	    // Get or create resource
//	    resource = transaction.getOrCreateResource("/Users/lb/SAQx/SAQxCDORepositoryResource");
//	
//	    return resource;
//	}
//	public void commitCmdEngineCDOResource(){
//	    transaction.commit();
//	}
//	public void finishCmdEngineCDOResource() {
//	    // Cleanup
//	    session.close();
//	    //connector.close();
//	    //container.deactivate();
//	}
}
