/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10469706;

/**
 *
 * @author Njabulo Skondo
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MessageStatusTest {
    
    @Test
    public void testCheckMessageID() {
        MessageStatus msg = new MessageStatus("+2783123456", "Hello world", 1);
        assertTrue(msg.checkMessageID());
    }
    
    @Test
    public void testCheckRecipientCell_Valid() {
        MessageStatus msg = new MessageStatus("+27831234567", "Hi", 1);
        assertTrue(msg.checkRecipientCell());
    }
    
    @Test
    public void testCheckRecipientCell_Invalid() {
        MessageStatus msg = new MessageStatus("083123456", "Hi", 1);
        assertFalse(new MessageStatus("083123456", "Hi", 1).checkRecipientCell());
    }
    
    @Test
    public void testCreateMessageHash() {
        MessageStatus msg = new MessageStatus("+2783123456", "Hello world", 1);
        String hash = msg.createMessageHash();
        assertNotNull(hash);
        assertTrue(hash.contains("HELLOWORLD"));
    }
    
}
