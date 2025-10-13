/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10469706;

/**
 *
 * @author Njabulo Skondo
 */

import java.util.*;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class MessageStatus {
    private String messageID;
    private int messageCount;
    private String recipient;
    private String messageHash;
    private String message;
    
    // Static counters and storage
    private static int totalMessages = 0;
    private static List<MessageStatus> sentMessages = new ArrayList <>();
    
    // Constructor
    public MessageStatus(String recipient, String message, int messageCount) {
        this.messageID = generateMessageID();
        this.messageCount = messageCount;
        this.recipient = recipient;
        this.message = message;
        this.messageHash = createMessageHash();
    }
    
    private String generateMessageID() {
        return String.valueOf(new Random().nextInt(900000000) + 100000000 );
    }
    
    public boolean checkMessageID() {
        return messageID.length() == 10;
    }
    
    public boolean checkRecipientCell() {
        return recipient != null && recipient.length() == 12 && recipient.startsWith("+27");
    }
    
    public String createMessageHash() {
        String[] words = message.split(" ");
        String first = words[0].toUpperCase();
        String last = words[words.length - 1].toUpperCase();
        return messageID.substring(0, 2) + ":" + messageCount + ":" + first + last;
    }
    
    public String sentMessages(String choice) {
        switch (choice.toLowerCase()) {
            case "send":
                sentMessages.add(this);
                totalMessages++;
                return "Message successfully sent.";
            case "discard":
                return "Press 0 to delete message.";
            case "store":
                storeMessage();
                return "Message successfully stored.";
            default:
                return "Invalid option.";
        }
    }
    
    public void storeMessage() {
        try (FileWriter writer = new FileWriter("storeMessages.json", true)) {
            new Gson().toJson(this, writer);
        } catch (IOException e) {
            System.out.println("Error storing message: " + e.getMessage());
        }
    }
    
    public static String printMessage() {
        StringBuilder sb = new StringBuilder();
        for (MessageStatus msg : sentMessages) {
            sb.append("MessageID: ").append(msg.messageID).append("\n")
                    .append("Message Hash: ").append(msg.messageHash).append("\n")
                    .append("Recipient: ").append(msg.recipient).append("\n")
                    .append("Message: ").append(msg.message).append("\n\n");
        }
        return sb.toString();
    }
    
    public static int returnTotalMessage() {
        return totalMessages;
    }
}
