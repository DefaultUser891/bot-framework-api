/*
 * Microsoft Bot Connector API - v3.0
 * The Bot Connector REST API allows your bot to send and receive messages to channels configured in the  [Bot Framework Developer Portal](https://dev.botframework.com). The Connector service uses industry-standard REST  and JSON over HTTPS.    Client libraries for this REST API are available. See below for a list.    Many bots will use both the Bot Connector REST API and the associated [Bot State REST API](/en-us/restapi/state). The  Bot State REST API allows a bot to store and retrieve state associated with users and conversations.    Authentication for both the Bot Connector and Bot State REST APIs is accomplished with JWT Bearer tokens, and is  described in detail in the [Connector Authentication](/en-us/restapi/authentication) document.    # Client Libraries for the Bot Connector REST API    * [Bot Builder for C#](/en-us/csharp/builder/sdkreference/)  * [Bot Builder for Node.js](/en-us/node/builder/overview/)  * Generate your own from the [Connector API Swagger file](https://raw.githubusercontent.com/Microsoft/BotBuilder/master/CSharp/Library/Microsoft.Bot.Connector.Shared/Swagger/ConnectorAPI.json)    Â© 2016 Microsoft
 *
 * OpenAPI spec version: v3
 * Contact: botframework@microsoft.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Activity;
import io.swagger.client.model.AttachmentData;
import io.swagger.client.model.ChannelAccount;
import io.swagger.client.model.ConversationParameters;
import io.swagger.client.model.ConversationResourceResponse;
import io.swagger.client.model.ErrorResponse;
import io.swagger.client.model.ResourceResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConversationsApi
 */
@Ignore
public class ConversationsApiTest {

    private final ConversationsApi api = new ConversationsApi();

    
    /**
     * CreateConversation
     *
     * Create a new Conversation.    POST to this method with a  * Bot being the bot creating the conversation  * IsGroup set to true if this is not a direct message (default is false)  * Members array contining the members you want to have be in the conversation.    The return value is a ResourceResponse which contains a conversation id which is suitable for use  in the message payload and REST API uris.    Most channels only support the semantics of bots initiating a direct message conversation.  An example of how to do that would be:    &#x60;&#x60;&#x60;  var resource &#x3D; await connector.conversations.CreateConversation(new ConversationParameters(){ Bot &#x3D; bot, members &#x3D; new ChannelAccount[] { new ChannelAccount(\&quot;user1\&quot;) } );  await connect.Conversations.SendToConversationAsync(resource.Id, new Activity() ... ) ;    &#x60;&#x60;&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conversationsCreateConversationTest() throws ApiException {
        ConversationParameters parameters = null;
        ConversationResourceResponse response = api.conversationsCreateConversation(parameters);

        // TODO: test validations
    }
    
    /**
     * DeleteActivity
     *
     * Delete an existing activity.    Some channels allow you to delete an existing activity, and if successful this method will remove the specified activity.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conversationsDeleteActivityTest() throws ApiException {
        String conversationId = null;
        String activityId = null;
        api.conversationsDeleteActivity(conversationId, activityId);

        // TODO: test validations
    }
    
    /**
     * GetActivityMembers
     *
     * Enumerate the members of an activity.     This REST API takes a ConversationId and a ActivityId, returning an array of ChannelAccount objects representing the members of the particular activity in the conversation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conversationsGetActivityMembersTest() throws ApiException {
        String conversationId = null;
        String activityId = null;
        List<ChannelAccount> response = api.conversationsGetActivityMembers(conversationId, activityId);

        // TODO: test validations
    }
    
    /**
     * GetConversationMembers
     *
     * Enumerate the members of a converstion.     This REST API takes a ConversationId and returns an array of ChannelAccount objects representing the members of the conversation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conversationsGetConversationMembersTest() throws ApiException {
        String conversationId = null;
        List<ChannelAccount> response = api.conversationsGetConversationMembers(conversationId);

        // TODO: test validations
    }
    
    /**
     * ReplyToActivity
     *
     * This method allows you to reply to an activity.    This is slightly different from SendToConversation().  * SendToConverstion(conversationId) - will append the activity to the end of the conversation according to the timestamp or semantics of the channel.  * ReplyToActivity(conversationId,ActivityId) - adds the activity as a reply to another activity, if the channel supports it. If the channel does not support nested replies, ReplyToActivity falls back to SendToConversation.    Use ReplyToActivity when replying to a specific activity in the conversation.    Use SendToConversation in all other cases.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conversationsReplyToActivityTest() throws ApiException {
        String conversationId = null;
        String activityId = null;
        Activity activity = null;
        ResourceResponse response = api.conversationsReplyToActivity(conversationId, activityId, activity);

        // TODO: test validations
    }
    
    /**
     * SendToConversation
     *
     * This method allows you to send an activity to the end of a conversation.    This is slightly different from ReplyToActivity().  * SendToConverstion(conversationId) - will append the activity to the end of the conversation according to the timestamp or semantics of the channel.  * ReplyToActivity(conversationId,ActivityId) - adds the activity as a reply to another activity, if the channel supports it. If the channel does not support nested replies, ReplyToActivity falls back to SendToConversation.    Use ReplyToActivity when replying to a specific activity in the conversation.    Use SendToConversation in all other cases.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conversationsSendToConversationTest() throws ApiException {
        Activity activity = null;
        String conversationId = null;
        ResourceResponse response = api.conversationsSendToConversation(activity, conversationId);

        // TODO: test validations
    }
    
    /**
     * UpdateActivity
     *
     * Edit an existing activity.    Some channels allow you to edit an existing activity to reflect the new state of a bot conversation.    For example, you can remove buttons after someone has clicked \&quot;Approve\&quot; button.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conversationsUpdateActivityTest() throws ApiException {
        String conversationId = null;
        String activityId = null;
        Activity activity = null;
        ResourceResponse response = api.conversationsUpdateActivity(conversationId, activityId, activity);

        // TODO: test validations
    }
    
    /**
     * UploadAttachment
     *
     * Upload an attachment directly into a channel&#39;s blob storage.    This is useful because it allows you to store data in a compliant store when dealing with enterprises.    The response is a ResourceResponse which contains an AttachmentId which is suitable for using with the attachments API.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void conversationsUploadAttachmentTest() throws ApiException {
        String conversationId = null;
        AttachmentData attachmentUpload = null;
        ResourceResponse response = api.conversationsUploadAttachment(conversationId, attachmentUpload);

        // TODO: test validations
    }
    
}