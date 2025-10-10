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
}
