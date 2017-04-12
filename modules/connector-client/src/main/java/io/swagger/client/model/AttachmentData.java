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
 * Attachment data
 */
@ApiModel(description = "Attachment data")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-01T20:17:11.555+04:00")
public class AttachmentData {
  @SerializedName("type")
  private String type = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("originalBase64")
  private byte[] originalBase64 = null;

  @SerializedName("thumbnailBase64")
  private byte[] thumbnailBase64 = null;

  public AttachmentData type(String type) {
    this.type = type;
    return this;
  }

   /**
   * content type of the attachmnet
   * @return type
  **/
  @ApiModelProperty(value = "content type of the attachmnet")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AttachmentData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the attachment
   * @return name
  **/
  @ApiModelProperty(value = "Name of the attachment")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AttachmentData originalBase64(byte[] originalBase64) {
    this.originalBase64 = originalBase64;
    return this;
  }

   /**
   * original content
   * @return originalBase64
  **/
  @ApiModelProperty(value = "original content")
  public byte[] getOriginalBase64() {
    return originalBase64;
  }

  public void setOriginalBase64(byte[] originalBase64) {
    this.originalBase64 = originalBase64;
  }

  public AttachmentData thumbnailBase64(byte[] thumbnailBase64) {
    this.thumbnailBase64 = thumbnailBase64;
    return this;
  }

   /**
   * Thumbnail
   * @return thumbnailBase64
  **/
  @ApiModelProperty(value = "Thumbnail")
  public byte[] getThumbnailBase64() {
    return thumbnailBase64;
  }

  public void setThumbnailBase64(byte[] thumbnailBase64) {
    this.thumbnailBase64 = thumbnailBase64;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentData attachmentData = (AttachmentData) o;
    return Objects.equals(this.type, attachmentData.type) &&
        Objects.equals(this.name, attachmentData.name) &&
        Objects.equals(this.originalBase64, attachmentData.originalBase64) &&
        Objects.equals(this.thumbnailBase64, attachmentData.thumbnailBase64);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, originalBase64, thumbnailBase64);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentData {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originalBase64: ").append(toIndentedString(originalBase64)).append("\n");
    sb.append("    thumbnailBase64: ").append(toIndentedString(thumbnailBase64)).append("\n");
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

