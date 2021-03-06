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

/**
 * An attachment within an activity
 */
@ApiModel(description = "An attachment within an activity")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-01T20:17:11.555+04:00")
public class Attachment {
  @SerializedName("contentType")
  private String contentType = null;

  @SerializedName("contentUrl")
  private String contentUrl = null;

  @SerializedName("content")
  private Object content = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("thumbnailUrl")
  private String thumbnailUrl = null;

  public Attachment contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * mimetype/Contenttype for the file
   * @return contentType
  **/
  @ApiModelProperty(value = "mimetype/Contenttype for the file")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public Attachment contentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
    return this;
  }

   /**
   * Content Url
   * @return contentUrl
  **/
  @ApiModelProperty(value = "Content Url")
  public String getContentUrl() {
    return contentUrl;
  }

  public void setContentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
  }

  public Attachment content(Object content) {
    this.content = content;
    return this;
  }

   /**
   * Embedded content
   * @return content
  **/
  @ApiModelProperty(value = "Embedded content")
  public Object getContent() {
    return content;
  }

  public void setContent(Object content) {
    this.content = content;
  }

  public Attachment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * (OPTIONAL) The name of the attachment
   * @return name
  **/
  @ApiModelProperty(value = "(OPTIONAL) The name of the attachment")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Attachment thumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
    return this;
  }

   /**
   * (OPTIONAL) Thumbnail associated with attachment
   * @return thumbnailUrl
  **/
  @ApiModelProperty(value = "(OPTIONAL) Thumbnail associated with attachment")
  public String getThumbnailUrl() {
    return thumbnailUrl;
  }

  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.contentType, attachment.contentType) &&
        Objects.equals(this.contentUrl, attachment.contentUrl) &&
        Objects.equals(this.content, attachment.content) &&
        Objects.equals(this.name, attachment.name) &&
        Objects.equals(this.thumbnailUrl, attachment.thumbnailUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, contentUrl, content, name, thumbnailUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    contentUrl: ").append(toIndentedString(contentUrl)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    thumbnailUrl: ").append(toIndentedString(thumbnailUrl)).append("\n");
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

