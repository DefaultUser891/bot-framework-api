package com.botframework.app;

import org.glassfish.jersey.server.ResourceConfig;


/**
 * Created by some user on 15.04.2017.
 */
public class BotFrameworkApplication extends ResourceConfig {

    public BotFrameworkApplication() {
        packages("com.botframework.jersey.resources");

    }



}
