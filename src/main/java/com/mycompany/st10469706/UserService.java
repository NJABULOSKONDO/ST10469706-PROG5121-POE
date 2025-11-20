/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Njabulo Skondo
 */

package com.mycompany.st10469706;

import java.util.*;
import java.io.*;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.Reader;
import java.io.IOException;
import com.google.gson.reflect.TypeToken;

public class UserService {
    
    private List<MessageStatus> sentMessages = new ArrayList<>();
    private List<MessageStatus> storedMessages = new ArrayList<>();
    private List<MessageStatus> disregardedMessages = new ArrayList<>();
    private List<String> messageHashes = new ArrayList<>();
    private List<String> messageIDs = new ArrayList<>();
    
   // Username must contain underscore and be <= 5 characters
    public String validateUsername(String username) {
        if (username.contains("_") && username.length() <= 5){
            return "Username successfully captured.";
        } else {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";            
        }
    }
    // Password must be >= 8 chars, include capital, number, and special char
    public String validatePassword(String password) {
        if (password.length() >= 8 &&
            password.matches(".*[A-Z].*") &&
            password.matches(".*\\d.*") &&
            password.matches(".*[!@#$%^&*(),.?\"{}|<>].*")) {
            return "Password successfully captured.";
        }
        return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";      
    }
    
    // SA phone number validation
    public String validatePhoneNumber(String phone) {
        if (phone.length() == 10 && phone.startsWith("0")) {
            return "Phone number successfully captured.";
        }
        return "Phone number is not correctly formatted; please enter a valid 10-digit South African cell number starting with 0.";
    }

    public boolean registerUser(String username, String password, String phone) {
        return validateUsername(username).equals("Username successfully captured.") &&
               validatePassword(password).equals("Password successfully captured.") &&
               validatePhoneNumber(phone).equals("Phone number successfully captured.");
    }

    // Add message to appropriate array
    public void processMessage(MessageStatus msg, String flag) {
        switch (flag.toLowerCase()) {
            case "sent":
                sentMessages.add(msg);
                break;
            case "stored":
                storedMessages.add(msg);
                storeMessageToJSON(msg);
                break;
            case "disregard":
                disregardedMessages.add(msg);
                break;
        }
        messageHashes.add(msg.createMessageHash());
        messageIDs.add(msg.getMessageID());
    }

 // Store message to JSON
    private void storeMessageToJSON(MessageStatus msg) {
        try (FileWriter writer = new FileWriter("storeMessages.json", true)) {
            new Gson().toJson(msg, writer);
        } catch (IOException e) {
            System.out.println("Error storing message: " + e.getMessage());
        }
    }

    // Code for reading JSON into storeMessages array was assisted by ChatGPT
    public void loadStoredMessages() {
        try (Reader reader = new FileReader("storeMessages.json")) {
            Gson gson = new Gson();
            // Option 2: Directly into a List
            storedMessages = gson.fromJson(reader, new TypeToken<List<MessageStatus>>(){}.getType());
        } catch (IOException e) {
           e.printStackTrace();
        }
    }

    // Display sender and recipient of all sent messages
    public void displaySenderRecipient() {
        for (MessageStatus msg : sentMessages) {
            System.out.println("Recipient: " + msg.getRecipient());
            System.out.println("Message: " + msg.getMessage());
            System.out.println();
        }
    }

    // Find longest message
    public String getLongestMessage() {
        return sentMessages.stream()
                .max(Comparator.comparingInt(m -> m.getMessage().length()))
                .map(MessageStatus::getMessage)
                .orElse("No messages found.");
    }

    // Search by message ID
    public String searchByMessageID(String id) {
        for (MessageStatus msg : sentMessages) {
            if (msg.getMessageID().equals(id)) {
                return "Recipient: " + msg.getRecipient() + "\nMessage: " + msg.getMessage();
            }
        }
        return "Message ID not found.";
    }

    // Search by recipient
    public List<String> searchByRecipient(String recipient) {
        List<String> results = new ArrayList<>();
        for (MessageStatus msg : sentMessages) {
            if (msg.getRecipient().equals(recipient)) {
                results.add(msg.getMessage());
            }
        }
        for (MessageStatus msg : storedMessages) {
            if (msg.getRecipient().equals(recipient)) {
                results.add(msg.getMessage());
            }
        }
        return results;
    }

    // Delete by hash
    public String deleteByHash(String hash) {
        Iterator<MessageStatus> iterator = sentMessages.iterator();
        while (iterator.hasNext()) {
            MessageStatus msg = iterator.next();
            if (msg.createMessageHash().equals(hash)) {
                iterator.remove();
                return "Message \"" + msg.getMessage() + "\" successfully deleted.";
            }
        }
        return "Message hash not found.";
    }

    // Display full report
    public void displayReport() {
        for (MessageStatus msg : sentMessages) {
            System.out.println("Message Hash: " + msg.createMessageHash());
            System.out.println("Recipient: " + msg.getRecipient());
            System.out.println("Message: " + msg.getMessage());
            System.out.println();
        }
    }
    
    // Getter for disregarded messages (used in unit tests)
    public List<MessageStatus> getDisregardedMessages() {
    return disregardedMessages;
    }
}
