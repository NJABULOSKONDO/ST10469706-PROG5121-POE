package com.mycompany.st10469706
/*
 * Represents a message in the chat app with delivery status flags.
 *
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Njabulo Skondo
 */
public class Message {
    private String messageText;
    private boolean isSent;
    private boolean isReceived;
    private boolean isRead;
    private String recipientPhoneNumber;
    
    /**
     * Constructor to initialize a message with its content and recipient.
     * @param messageText The actual message content.
     * @param recipientPhoneNumber The phone number of the recipient.
     */
    public Message(String messageText, String recipientPhoneNumber) {
        this.messageText = messageText;
        this.recipientPhoneNumber = recipientPhoneNumber;
        this.isSent = false;
        this.isReceived = false;
        this.isRead = false;
    }
    
    // Getters
    public String getMessageText() {
        return messageText;
    }
    
    public boolean isReceived() {
        return isReceived;
    }
    
    public boolean isRead() {
        return isRead;
    }
    
    public String getRecipientPhoneNumber() {
        return recipientPhoneNumber;
    }
    
    // Setters
    public void markAsSent() {
        this.isSent = true;
    }
    
    public void markAsReceived() {
        this.isReceived = true;
    }
    
    public void markAsRead() {
        this.isRead = true;
    }
    
    /**
     * Returns a summary of the message status.
     */
    public String getStatusReport() {
        return "Message: \"" + messageText + "\"\n" +
                "To: " + recipientPhoneNumber + "\n" +
                "Sent: " + isSent + "\n" +
                "Received: " + isReceived + "\n" +
                "Read: " + isRead;
    }
}
