package com.botframework.auth;

import org.junit.Test;

/**
 * Created by urusaai on 11.04.2017.
 */
public class AuthenticationTest {

    @Test
    public void testAuthRequest() {
        AuthenticationApi authenticationApi = new AuthenticationApi();
        authenticationApi.requestToken();
    }

}
