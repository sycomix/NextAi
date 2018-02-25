package com.bot.chatbot.chatbot;

/**
 * Created by adnansahinovic on 9/26/17.
 */

public class ChatMessage {

  private String msgText;
  private String msgUser;

  public ChatMessage(String msgText, String msgUser) {
    this.msgText = msgText;
    this.msgUser = msgUser;
  }

  public ChatMessage() {

  }

  public String getMsgText() {
    return msgText;
  }

  public void setMsgText(String msgText) {
    this.msgText = msgText;
  }

  public String getMsgUser() {
    return msgUser;
  }

  public void setMsgUser(String msgUser) {
    this.msgUser = msgUser;
  }
}