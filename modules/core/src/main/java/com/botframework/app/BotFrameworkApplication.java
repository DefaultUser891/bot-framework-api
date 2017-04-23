package com.botframework.app;

import com.botframework.app.inject.ConnectorClientBinder;
import com.botframework.app.inject.Log4jBinderFactory;
import org.apache.log4j.Logger;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;


/**
 * Created by some user on 15.04.2017.
 */
public class BotFrameworkApplication extends ResourceConfig {

    public BotFrameworkApplication() {
        packages("com.botframework.jersey.resources");
        register(new ConnectorClientBinder());
        register(new AbstractBinder() {
            @Override
            protected void configure() {
                bindFactory(Log4jBinderFactory.class).to(Logger.class);
            }
        });
    }


}
