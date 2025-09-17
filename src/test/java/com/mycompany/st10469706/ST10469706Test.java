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
public class ST10469706Test {
    
    UserService service = new UserService();
    
    @Test
    public void testInvalidUsername() {
        String result = service.validateUsername("hlathi");
        assertEquals("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.", result);        
    }
    
    @Test
    public void testValidPassword() {
        String result = service.validatePassword("Secure@123");
        assertEquals("Password successfully captured.", result);
    }
    
    @Test
    public void testInvalidPassword() {
        String result = service.validatePassword("weakpass");
        assertEquals("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.", result);
    }
    
    @Test
    public void testValidPhoneNumber() {
        String result = service.validatePhoneNumber("0821234567");
        assertEquals("Phone number successfully captured.", result);
    }
    
    @Test
    public void testInvalidPhoneNumberTooShort() {
        String result = service.validatePhoneNumber("08212345");
        assertEquals("Phone number is not correctly formatted; please enter a valid 10-digit South African cell number starting with 0.", result);
    }
    
    @Test
    public void testInvalidPhoneNumberWrongStart() {
        String result = service.validatePhoneNumber("1821234567");
        assertEquals("Phone number is not correctly formatted; please enter a valid 10-digit South African cell number starting with 0.", result);
    }
}
