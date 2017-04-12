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
import io.swagger.client.model.CardAction;
import io.swagger.client.model.MediaUrl;
import io.swagger.client.model.ThumbnailUrl;
import java.util.ArrayList;
import java.util.List;

/**
 * A audio card
 */
@ApiModel(description = "A audio card")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-01T20:17:11.555+04:00")
public class AudioCard {
  @SerializedName("title")
  private String title = null;

  @SerializedName("subtitle")
  private String subtitle = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("image")
  private ThumbnailUrl image = null;

  @SerializedName("media")
  private List<MediaUrl> media = new ArrayList<MediaUrl>();

  @SerializedName("buttons")
  private List<CardAction> buttons = new ArrayList<CardAction>();

  @SerializedName("shareable")
  private Boolean shareable = null;

  @SerializedName("autoloop")
  private Boolean autoloop = null;

  @SerializedName("autostart")
  private Boolean autostart = null;

  @SerializedName("aspect")
  private String aspect = null;

  public AudioCard title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of the card
   * @return title
  **/
  @ApiModelProperty(value = "Title of the card")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AudioCard subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

   /**
   * Subtitle of the card
   * @return subtitle
  **/
  @ApiModelProperty(value = "Subtitle of the card")
  public String getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  public AudioCard text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text of the card
   * @return text
  **/
  @ApiModelProperty(value = "Text of the card")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public AudioCard image(ThumbnailUrl image) {
    this.image = image;
    return this;
  }

   /**
   * Thumbnail placeholder
   * @return image
  **/
  @ApiModelProperty(value = "Thumbnail placeholder")
  public ThumbnailUrl getImage() {
    return image;
  }

  public void setImage(ThumbnailUrl image) {
    this.image = image;
  }

  public AudioCard media(List<MediaUrl> media) {
    this.media = media;
    return this;
  }

  public AudioCard addMediaItem(MediaUrl mediaItem) {
    this.media.add(mediaItem);
    return this;
  }

   /**
   * Array of media Url objects
   * @return media
  **/
  @ApiModelProperty(value = "Array of media Url objects")
  public List<MediaUrl> getMedia() {
    return media;
  }

  public void setMedia(List<MediaUrl> media) {
    this.media = media;
  }

  public AudioCard buttons(List<CardAction> buttons) {
    this.buttons = buttons;
    return this;
  }

  public AudioCard addButtonsItem(CardAction buttonsItem) {
    this.buttons.add(buttonsItem);
    return this;
  }

   /**
   * Set of actions applicable to the current card
   * @return buttons
  **/
  @ApiModelProperty(value = "Set of actions applicable to the current card")
  public List<CardAction> getButtons() {
    return buttons;
  }

  public void setButtons(List<CardAction> buttons) {
    this.buttons = buttons;
  }

  public AudioCard shareable(Boolean shareable) {
    this.shareable = shareable;
    return this;
  }

   /**
   * Is it OK for this content to be shareable with others (default:true)
   * @return shareable
  **/
  @ApiModelProperty(value = "Is it OK for this content to be shareable with others (default:true)")
  public Boolean getShareable() {
    return shareable;
  }

  public void setShareable(Boolean shareable) {
    this.shareable = shareable;
  }

  public AudioCard autoloop(Boolean autoloop) {
    this.autoloop = autoloop;
    return this;
  }

   /**
   * Should the client loop playback at end of content (default:true)
   * @return autoloop
  **/
  @ApiModelProperty(value = "Should the client loop playback at end of content (default:true)")
  public Boolean getAutoloop() {
    return autoloop;
  }

  public void setAutoloop(Boolean autoloop) {
    this.autoloop = autoloop;
  }

  public AudioCard autostart(Boolean autostart) {
    this.autostart = autostart;
    return this;
  }

   /**
   * Should the client automatically start playback of video in this card (default:true)
   * @return autostart
  **/
  @ApiModelProperty(value = "Should the client automatically start playback of video in this card (default:true)")
  public Boolean getAutostart() {
    return autostart;
  }

  public void setAutostart(Boolean autostart) {
    this.autostart = autostart;
  }

  public AudioCard aspect(String aspect) {
    this.aspect = aspect;
    return this;
  }

   /**
   * Aspect ratio of thumbnail/media placeholder, allowed values are \"16x9\" and \"9x16\"
   * @return aspect
  **/
  @ApiModelProperty(value = "Aspect ratio of thumbnail/media placeholder, allowed values are \"16x9\" and \"9x16\"")
  public String getAspect() {
    return aspect;
  }

  public void setAspect(String aspect) {
    this.aspect = aspect;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudioCard audioCard = (AudioCard) o;
    return Objects.equals(this.title, audioCard.title) &&
        Objects.equals(this.subtitle, audioCard.subtitle) &&
        Objects.equals(this.text, audioCard.text) &&
        Objects.equals(this.image, audioCard.image) &&
        Objects.equals(this.media, audioCard.media) &&
        Objects.equals(this.buttons, audioCard.buttons) &&
        Objects.equals(this.shareable, audioCard.shareable) &&
        Objects.equals(this.autoloop, audioCard.autoloop) &&
        Objects.equals(this.autostart, audioCard.autostart) &&
        Objects.equals(this.aspect, audioCard.aspect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, subtitle, text, image, media, buttons, shareable, autoloop, autostart, aspect);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudioCard {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    buttons: ").append(toIndentedString(buttons)).append("\n");
    sb.append("    shareable: ").append(toIndentedString(shareable)).append("\n");
    sb.append("    autoloop: ").append(toIndentedString(autoloop)).append("\n");
    sb.append("    autostart: ").append(toIndentedString(autostart)).append("\n");
    sb.append("    aspect: ").append(toIndentedString(aspect)).append("\n");
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

