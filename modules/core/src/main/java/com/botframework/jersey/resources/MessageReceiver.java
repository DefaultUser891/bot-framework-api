package com.botframework.jersey.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by some user on 13.04.2017.
 */
@Path("messages")
public class MessageReceiver {

    @GET
    public void receiveMessage() {
        System.out.println("success");
    }
}
