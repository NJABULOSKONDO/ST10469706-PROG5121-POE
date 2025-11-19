/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.st10469706;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Njabulo Skondo
 */
public class MainTest {
    
    UserService service = new UserService();
    
    @Test
    public void testValidateUsername() {
        assertEquals("Username successfully captured.", service.validateUsername("kyl_1"));
    }
    
    @Test
    public void testInvalidUsername() {
        assertEquals("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.",service.validateUsername("kyle!!!!!!!"));
    }
    
    @Test
    public void testValidPassword() {
        assertEquals("Password successfully captured.", service.validatePassword("Ch&&sec@ke99!"));
    }
    
    @Test
    public void testInvalidPassword() {
        assertEquals("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.", service.validatePassword("password"));
    }
    
    @Test
    public void testValidPhoneNumber() {
        assertEquals("Phone number successfully captured.", service.validatePhoneNumber("0838968976"));
    }
    
    @Test
    public void testInvalidPhoneNumberTooShort() {
        assertEquals("Phone number is not correctly formatted; please enter a valid 10-digit South African cell number starting with 0.", service.validatePhoneNumber("08966553"));
    }
    
    @Test
    public void testSuccessfulRegistration() {
         assertTrue(service.registerUser("kyl_1", "Ch&&sec@ke99!", "0838968976"));

    }
    
    @Test
    public void testFailedRegistration() {
        assertFalse(service.registerUser("kyle!!!!!!!","password","08966553"));
    }
    
    @Test
    public void testSentMessagesArray() {
        UserService service = new UserService();
        MessageStatus msg1 = new MessageStatus("+27834557896", "Did you get the cake?", 1);
        MessageStatus msg4 = new MessageStatus("0838884567", "It is dinner time!", 4);
        service.processMessage(msg1, "sent");
        service.processMessage(msg4, "sent");

        assertEquals("Did you get the cake?", service.searchByMessageID(msg1.getMessageID()).split("\n")[1].replace("Message: ", ""));
        assertEquals("It is dinner time!", service.searchByMessageID(msg4.getMessageID()).split("\n")[1].replace("Message: ", ""));
    }

    @Test
    public void testLongestMessage() {
        UserService service = new UserService();
        service.processMessage(new MessageStatus("+27834557896", "Did you get the cake?", 1), "sent");
        service.processMessage(new MessageStatus("+27838884567", "Where are you? You are late! I have asked you to be on time.", 2), "sent");

        assertEquals("Where are you? You are late! I have asked you to be on time.", service.getLongestMessage());
    }

    @Test
    public void testSearchByMessageID() {
        UserService service = new UserService();
        MessageStatus msg = new MessageStatus("0838884567", "It is dinner time!", 4);
        service.processMessage(msg, "sent");

        assertTrue(service.searchByMessageID(msg.getMessageID()).contains("It is dinner time!"));
    }

    @Test
    public void testSearchByRecipient() {
        UserService service = new UserService();
        service.processMessage(new MessageStatus("+27838884567", "Where are you? You are late! I have asked you to be on time.", 2), "sent");
        service.processMessage(new MessageStatus("+27838884567", "Ok, I am leaving without you.", 5), "stored");

        List<String> results = service.searchByRecipient("+27838884567");
        assertTrue(results.contains("Where are you? You are late! I have asked you to be on time."));
        assertTrue(results.contains("Ok, I am leaving without you."));
    }

    @Test
    public void testDeleteByHash() {
        UserService service = new UserService();
        MessageStatus msg = new MessageStatus("+27838884567", "Where are you? You are late! I have asked you to be on time.", 2);
        service.processMessage(msg, "sent");

        String result = service.deleteByHash(msg.createMessageHash());
        assertEquals("Message \"Where are you? You are late! I have asked you to be on time.\" successfully deleted.", result);
    }

  }

