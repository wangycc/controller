/*
* Generated file
*
* Generated from: yang module name: message-bus-app-impl yang module local name: messagebus-app-impl
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Tue Feb 03 09:03:11 CET 2015
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.controller.config.yang.messagebus.app.impl;

import org.opendaylight.controller.config.api.DependencyResolver;
import org.opendaylight.controller.config.api.DynamicMBeanWithInstance;
import org.opendaylight.controller.config.spi.Module;
import org.osgi.framework.BundleContext;

public class MessageBusAppImplModuleFactory extends org.opendaylight.controller.config.yang.messagebus.app.impl.AbstractMessageBusAppImplModuleFactory {
    @Override
    public Module createModule(String instanceName,
                               DependencyResolver dependencyResolver,
                               BundleContext bundleContext) {

        MessageBusAppImplModule module =
                (MessageBusAppImplModule) super.createModule(instanceName,
                        dependencyResolver,
                        bundleContext);

        module.setBundleContext(bundleContext);

        return module;
    }

    @Override
    public Module createModule(String instanceName,
                               DependencyResolver dependencyResolver,
                               DynamicMBeanWithInstance old,
                               BundleContext bundleContext)
            throws Exception {

        MessageBusAppImplModule module =
                (MessageBusAppImplModule) super.createModule(instanceName,
                        dependencyResolver,
                        old,
                        bundleContext);

        module.setBundleContext(bundleContext);

        return module;
    }

}
