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
    
    private static int totalMessages = 0;
    private static List<Message> sentMessages = new ArrayList <>();
    
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
    
}
