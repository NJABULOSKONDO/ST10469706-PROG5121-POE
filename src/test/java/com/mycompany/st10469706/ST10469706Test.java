/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.st10469706;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Vavi Fuyego
 */
public class ST10469706Test {
    
    UserService service = new UserService();
    
    @Test
    public void testInvalidUsername() {
        String result = service.validateUsername("hlath");
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
}
