package com.botframework.app.inject;

import org.apache.log4j.Logger;
import org.glassfish.hk2.api.Factory;
import org.glassfish.hk2.api.InstantiationData;
import org.glassfish.hk2.api.InstantiationService;

import javax.inject.Inject;

/**
 * Created by some user on 19.04.2017.
 */
public class Log4jBinderFactory implements Factory<Logger> {

    @Inject
    protected InstantiationService instantiationService;

    @Override
    public Logger provide() {
        InstantiationData instantiationData = instantiationService.getInstantiationData();
        Class<?> injecteeClass = instantiationData.getParentInjectee().getInjecteeClass();
        return Logger.getLogger(injecteeClass);
    }

    @Override
    public void dispose(Logger instance) {

    }
}
