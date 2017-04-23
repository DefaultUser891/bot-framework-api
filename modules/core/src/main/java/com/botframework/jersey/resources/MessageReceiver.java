package com.botframework.jersey.resources;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Activity;
import org.apache.log4j.Logger;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by some user on 13.04.2017.
 */
@Path("messages")
public class MessageReceiver {

    @Inject
    protected ApiClient apiClient;

    @Inject
    protected Logger logger;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response receiveMessage(String requestBody) {
        try {
            Activity activity = apiClient.getJSON().deserialize(requestBody, Activity.class);
            String conversationId = activity.getConversation().getId();
            logger.debug("Conversation id is " + conversationId);
            return Response.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }
}
