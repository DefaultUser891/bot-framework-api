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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Attachment;
import io.swagger.client.model.CardAction;
import io.swagger.client.model.ChannelAccount;
import io.swagger.client.model.ConversationAccount;
import io.swagger.client.model.ConversationReference;
import io.swagger.client.model.Entity;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * An Activity is the basic communication type for the Bot Framework 3.0 protocol
 */
@ApiModel(description = "An Activity is the basic communication type for the Bot Framework 3.0 protocol")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-01T20:17:11.555+04:00")
public class Activity {
  @SerializedName("type")
  private String type = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("timestamp")
  private DateTime timestamp = null;

  @SerializedName("localTimestamp")
  private DateTime localTimestamp = null;

  @SerializedName("serviceUrl")
  private String serviceUrl = null;

  @SerializedName("channelId")
  private String channelId = null;

  @SerializedName("from")
  private ChannelAccount from = null;

  @SerializedName("conversation")
  private ConversationAccount conversation = null;

  @SerializedName("recipient")
  private ChannelAccount recipient = null;

  @SerializedName("textFormat")
  private String textFormat = null;

  @SerializedName("attachmentLayout")
  private String attachmentLayout = null;

  @SerializedName("membersAdded")
  private List<ChannelAccount> membersAdded = new ArrayList<ChannelAccount>();

  @SerializedName("membersRemoved")
  private List<ChannelAccount> membersRemoved = new ArrayList<ChannelAccount>();

  @SerializedName("topicName")
  private String topicName = null;

  @SerializedName("historyDisclosed")
  private Boolean historyDisclosed = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("summary")
  private String summary = null;

  @SerializedName("suggestedActions")
  private List<CardAction> suggestedActions = new ArrayList<CardAction>();

  @SerializedName("attachments")
  private List<Attachment> attachments = new ArrayList<Attachment>();

  @SerializedName("entities")
  private List<Entity> entities = new ArrayList<Entity>();

  @SerializedName("channelData")
  private Object channelData = null;

  @SerializedName("action")
  private String action = null;

  @SerializedName("replyToId")
  private String replyToId = null;

  @SerializedName("value")
  private Object value = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("relatesTo")
  private ConversationReference relatesTo = null;

  public Activity type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the activity [message|contactRelationUpdate|converationUpdate|typing|endOfConversation|event|invoke]
   * @return type
  **/
  @ApiModelProperty(value = "The type of the activity [message|contactRelationUpdate|converationUpdate|typing|endOfConversation|event|invoke]")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Activity id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of this activity
   * @return id
  **/
  @ApiModelProperty(value = "ID of this activity")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Activity timestamp(DateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * UTC Time when message was sent (set by service)
   * @return timestamp
  **/
  @ApiModelProperty(value = "UTC Time when message was sent (set by service)")
  public DateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(DateTime timestamp) {
    this.timestamp = timestamp;
  }

  public Activity localTimestamp(DateTime localTimestamp) {
    this.localTimestamp = localTimestamp;
    return this;
  }

   /**
   * Local time when message was sent (set by client, Ex: 2016-09-23T13:07:49.4714686-07:00)
   * @return localTimestamp
  **/
  @ApiModelProperty(value = "Local time when message was sent (set by client, Ex: 2016-09-23T13:07:49.4714686-07:00)")
  public DateTime getLocalTimestamp() {
    return localTimestamp;
  }

  public void setLocalTimestamp(DateTime localTimestamp) {
    this.localTimestamp = localTimestamp;
  }

  public Activity serviceUrl(String serviceUrl) {
    this.serviceUrl = serviceUrl;
    return this;
  }

   /**
   * Service endpoint where operations concerning the activity may be performed
   * @return serviceUrl
  **/
  @ApiModelProperty(value = "Service endpoint where operations concerning the activity may be performed")
  public String getServiceUrl() {
    return serviceUrl;
  }

  public void setServiceUrl(String serviceUrl) {
    this.serviceUrl = serviceUrl;
  }

  public Activity channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * ID of the channel where the activity was sent
   * @return channelId
  **/
  @ApiModelProperty(value = "ID of the channel where the activity was sent")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public Activity from(ChannelAccount from) {
    this.from = from;
    return this;
  }

   /**
   * Sender address
   * @return from
  **/
  @ApiModelProperty(value = "Sender address")
  public ChannelAccount getFrom() {
    return from;
  }

  public void setFrom(ChannelAccount from) {
    this.from = from;
  }

  public Activity conversation(ConversationAccount conversation) {
    this.conversation = conversation;
    return this;
  }

   /**
   * Conversation
   * @return conversation
  **/
  @ApiModelProperty(value = "Conversation")
  public ConversationAccount getConversation() {
    return conversation;
  }

  public void setConversation(ConversationAccount conversation) {
    this.conversation = conversation;
  }

  public Activity recipient(ChannelAccount recipient) {
    this.recipient = recipient;
    return this;
  }

   /**
   * (Outbound to bot only) Bot's address that received the message
   * @return recipient
  **/
  @ApiModelProperty(value = "(Outbound to bot only) Bot's address that received the message")
  public ChannelAccount getRecipient() {
    return recipient;
  }

  public void setRecipient(ChannelAccount recipient) {
    this.recipient = recipient;
  }

  public Activity textFormat(String textFormat) {
    this.textFormat = textFormat;
    return this;
  }

   /**
   * Format of text fields [plain|markdown] Default:markdown
   * @return textFormat
  **/
  @ApiModelProperty(value = "Format of text fields [plain|markdown] Default:markdown")
  public String getTextFormat() {
    return textFormat;
  }

  public void setTextFormat(String textFormat) {
    this.textFormat = textFormat;
  }

  public Activity attachmentLayout(String attachmentLayout) {
    this.attachmentLayout = attachmentLayout;
    return this;
  }

   /**
   * Hint for how to deal with multiple attachments: [list|carousel] Default:list
   * @return attachmentLayout
  **/
  @ApiModelProperty(value = "Hint for how to deal with multiple attachments: [list|carousel] Default:list")
  public String getAttachmentLayout() {
    return attachmentLayout;
  }

  public void setAttachmentLayout(String attachmentLayout) {
    this.attachmentLayout = attachmentLayout;
  }

  public Activity membersAdded(List<ChannelAccount> membersAdded) {
    this.membersAdded = membersAdded;
    return this;
  }

  public Activity addMembersAddedItem(ChannelAccount membersAddedItem) {
    this.membersAdded.add(membersAddedItem);
    return this;
  }

   /**
   * Array of address added
   * @return membersAdded
  **/
  @ApiModelProperty(value = "Array of address added")
  public List<ChannelAccount> getMembersAdded() {
    return membersAdded;
  }

  public void setMembersAdded(List<ChannelAccount> membersAdded) {
    this.membersAdded = membersAdded;
  }

  public Activity membersRemoved(List<ChannelAccount> membersRemoved) {
    this.membersRemoved = membersRemoved;
    return this;
  }

  public Activity addMembersRemovedItem(ChannelAccount membersRemovedItem) {
    this.membersRemoved.add(membersRemovedItem);
    return this;
  }

   /**
   * Array of addresses removed
   * @return membersRemoved
  **/
  @ApiModelProperty(value = "Array of addresses removed")
  public List<ChannelAccount> getMembersRemoved() {
    return membersRemoved;
  }

  public void setMembersRemoved(List<ChannelAccount> membersRemoved) {
    this.membersRemoved = membersRemoved;
  }

  public Activity topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

   /**
   * Conversations new topic name
   * @return topicName
  **/
  @ApiModelProperty(value = "Conversations new topic name")
  public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }

  public Activity historyDisclosed(Boolean historyDisclosed) {
    this.historyDisclosed = historyDisclosed;
    return this;
  }

   /**
   * True if the previous history of the channel is disclosed
   * @return historyDisclosed
  **/
  @ApiModelProperty(value = "True if the previous history of the channel is disclosed")
  public Boolean getHistoryDisclosed() {
    return historyDisclosed;
  }

  public void setHistoryDisclosed(Boolean historyDisclosed) {
    this.historyDisclosed = historyDisclosed;
  }

  public Activity locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * The language code of the Text field
   * @return locale
  **/
  @ApiModelProperty(value = "The language code of the Text field")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public Activity text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Content for the message
   * @return text
  **/
  @ApiModelProperty(value = "Content for the message")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Activity summary(String summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Text to display if the channel cannot render cards
   * @return summary
  **/
  @ApiModelProperty(value = "Text to display if the channel cannot render cards")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public Activity suggestedActions(List<CardAction> suggestedActions) {
    this.suggestedActions = suggestedActions;
    return this;
  }

  public Activity addSuggestedActionsItem(CardAction suggestedActionsItem) {
    this.suggestedActions.add(suggestedActionsItem);
    return this;
  }

   /**
   * SuggestedActions are used to provide keyboard/quickreply like behavior in many clients
   * @return suggestedActions
  **/
  @ApiModelProperty(value = "SuggestedActions are used to provide keyboard/quickreply like behavior in many clients")
  public List<CardAction> getSuggestedActions() {
    return suggestedActions;
  }

  public void setSuggestedActions(List<CardAction> suggestedActions) {
    this.suggestedActions = suggestedActions;
  }

  public Activity attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public Activity addAttachmentsItem(Attachment attachmentsItem) {
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Attachments
   * @return attachments
  **/
  @ApiModelProperty(value = "Attachments")
  public List<Attachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }

  public Activity entities(List<Entity> entities) {
    this.entities = entities;
    return this;
  }

  public Activity addEntitiesItem(Entity entitiesItem) {
    this.entities.add(entitiesItem);
    return this;
  }

   /**
   * Collection of Entity objects, each of which contains metadata about this activity. Each Entity object is typed.
   * @return entities
  **/
  @ApiModelProperty(value = "Collection of Entity objects, each of which contains metadata about this activity. Each Entity object is typed.")
  public List<Entity> getEntities() {
    return entities;
  }

  public void setEntities(List<Entity> entities) {
    this.entities = entities;
  }

  public Activity channelData(Object channelData) {
    this.channelData = channelData;
    return this;
  }

   /**
   * Channel-specific payload
   * @return channelData
  **/
  @ApiModelProperty(value = "Channel-specific payload")
  public Object getChannelData() {
    return channelData;
  }

  public void setChannelData(Object channelData) {
    this.channelData = channelData;
  }

  public Activity action(String action) {
    this.action = action;
    return this;
  }

   /**
   * ContactAdded/Removed action
   * @return action
  **/
  @ApiModelProperty(value = "ContactAdded/Removed action")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public Activity replyToId(String replyToId) {
    this.replyToId = replyToId;
    return this;
  }

   /**
   * The original ID this message is a response to
   * @return replyToId
  **/
  @ApiModelProperty(value = "The original ID this message is a response to")
  public String getReplyToId() {
    return replyToId;
  }

  public void setReplyToId(String replyToId) {
    this.replyToId = replyToId;
  }

  public Activity value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * Open-ended value
   * @return value
  **/
  @ApiModelProperty(value = "Open-ended value")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public Activity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the operation to invoke or the name of the event
   * @return name
  **/
  @ApiModelProperty(value = "Name of the operation to invoke or the name of the event")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Activity relatesTo(ConversationReference relatesTo) {
    this.relatesTo = relatesTo;
    return this;
  }

   /**
   * Reference to another conversation or activity
   * @return relatesTo
  **/
  @ApiModelProperty(value = "Reference to another conversation or activity")
  public ConversationReference getRelatesTo() {
    return relatesTo;
  }

  public void setRelatesTo(ConversationReference relatesTo) {
    this.relatesTo = relatesTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Activity activity = (Activity) o;
    return Objects.equals(this.type, activity.type) &&
        Objects.equals(this.id, activity.id) &&
        Objects.equals(this.timestamp, activity.timestamp) &&
        Objects.equals(this.localTimestamp, activity.localTimestamp) &&
        Objects.equals(this.serviceUrl, activity.serviceUrl) &&
        Objects.equals(this.channelId, activity.channelId) &&
        Objects.equals(this.from, activity.from) &&
        Objects.equals(this.conversation, activity.conversation) &&
        Objects.equals(this.recipient, activity.recipient) &&
        Objects.equals(this.textFormat, activity.textFormat) &&
        Objects.equals(this.attachmentLayout, activity.attachmentLayout) &&
        Objects.equals(this.membersAdded, activity.membersAdded) &&
        Objects.equals(this.membersRemoved, activity.membersRemoved) &&
        Objects.equals(this.topicName, activity.topicName) &&
        Objects.equals(this.historyDisclosed, activity.historyDisclosed) &&
        Objects.equals(this.locale, activity.locale) &&
        Objects.equals(this.text, activity.text) &&
        Objects.equals(this.summary, activity.summary) &&
        Objects.equals(this.suggestedActions, activity.suggestedActions) &&
        Objects.equals(this.attachments, activity.attachments) &&
        Objects.equals(this.entities, activity.entities) &&
        Objects.equals(this.channelData, activity.channelData) &&
        Objects.equals(this.action, activity.action) &&
        Objects.equals(this.replyToId, activity.replyToId) &&
        Objects.equals(this.value, activity.value) &&
        Objects.equals(this.name, activity.name) &&
        Objects.equals(this.relatesTo, activity.relatesTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, timestamp, localTimestamp, serviceUrl, channelId, from, conversation, recipient, textFormat, attachmentLayout, membersAdded, membersRemoved, topicName, historyDisclosed, locale, text, summary, suggestedActions, attachments, entities, channelData, action, replyToId, value, name, relatesTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activity {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    localTimestamp: ").append(toIndentedString(localTimestamp)).append("\n");
    sb.append("    serviceUrl: ").append(toIndentedString(serviceUrl)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    textFormat: ").append(toIndentedString(textFormat)).append("\n");
    sb.append("    attachmentLayout: ").append(toIndentedString(attachmentLayout)).append("\n");
    sb.append("    membersAdded: ").append(toIndentedString(membersAdded)).append("\n");
    sb.append("    membersRemoved: ").append(toIndentedString(membersRemoved)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    historyDisclosed: ").append(toIndentedString(historyDisclosed)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    suggestedActions: ").append(toIndentedString(suggestedActions)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    channelData: ").append(toIndentedString(channelData)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    replyToId: ").append(toIndentedString(replyToId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    relatesTo: ").append(toIndentedString(relatesTo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

