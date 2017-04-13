package com.botframework.auth;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;

/**
 * Created by urusaai on 09.04.2017.
 */
public class AuthenticationApi {

    public static final String BASE_URL = "https://login.microsoftonline.com";
    public static final String DEFAULT_SCOPE = "https://graph.microsoft.com/.default";
    public static final String JSON_CONTENT_TYPE = "application/json";

    public String requestToken() {
         try {
            ApiClient apiClient = new ApiClient();

            RequestBody requestBody = new FormEncodingBuilder().add("grant_type", "client_credentials")
                    .add("client_id", "0cb4c260-21ee-4cd3-9e76-90bd9b54ab76")
                    .add("client_secret", "i3KZgaOPkRyiNE0ycNgLAq1")
                    .add("scope", DEFAULT_SCOPE).build();

            Request request = new Request.Builder().url(BASE_URL + "/common/oauth2/v2.0/token")
                    .post(requestBody)
                    .build();

            Call call = apiClient.getHttpClient().newCall(request);
            ApiResponse<String> response = apiClient.execute(call, String.class);
            return response.getData();
        } catch (ApiException e) {
            return "12312";
        }
    }

}
