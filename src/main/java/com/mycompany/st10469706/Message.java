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

public class Message {
    private String messageID;
    private int messageCount;
    private String recipient;
    private String messageHash;
    
    // Static counters and storage
    private static int totalMessages = 0;
    private static List<Message> sentMessages = new ArrayList <>();
    
    // Constructor
    public Message(String recipient, String message, int messageCount) {
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
    
    public int checkRecipientCell() {
        return (recipient.length() =< 10 && recipient.startsWith("+")) ? 1:0;
    }
    
    public String createMessageHash() {
        String[] words = message.split(" ");
        String first = words[0].toUpperCase();
        String last = words[words.length - 1].toUpperCase();
        return messageID.substring(0, 2) + ":" + messageCount + ":" + first + last;
    }
}
