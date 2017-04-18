package com.botframework.app.context;

import io.swagger.client.ApiClient;
import io.swagger.client.api.ConversationsApi;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

import javax.inject.Singleton;

/**
 * Created by some user on 18.04.2017.
 */
public class ConnectorClientBinder extends AbstractBinder {
    @Override
    protected void configure() {
        bind(ApiClient.class).to(ApiClient.class).in(Singleton.class);
        bind(ConversationsApi.class).to(ConversationsApi.class).in(Singleton.class);
    }
}
