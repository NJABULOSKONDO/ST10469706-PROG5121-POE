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
    
    
}
