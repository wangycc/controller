/*
 * Copyright (c) 2014 Brocade Communications Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.controller.remote.rpc;


/***
 * Unit tests for RemoteRpcImplementation.
 *
 * @author Thomas Pantelis
 */
public class RemoteRpcImplementationTest extends AbstractRpcTest {


    private RemoteRpcProviderConfig getConfig(){
        return new RemoteRpcProviderConfig.Builder("unit-test").build();
    }
}
