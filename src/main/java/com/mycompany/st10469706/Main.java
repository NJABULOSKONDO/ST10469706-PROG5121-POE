/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author Njabulo Skondo
 */

package com.mycompany.st10469706;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();
        
        // Test 1: Valid Username
        System.out.println("Test 1: Valid Username: ");
        System.out.println(service.validateUsername("kyl_1")); // Expected: Success
        
        // Test 2: Invalid Username
        System.out.println("Test 2: Invalid Username");
        System.out.println(service.validateUsername("kyle!!!!!!!")); // Expected: Success
        
        // Test 3: Valid Password
        System.out.print("Test 3: Valid Password");
        System.out.println(service.validatePassword("Ch&&sec@ke99!")); // Expected:Success
        
        // Test 4: Invalid Password
        System.out.print("Test 4: Invalid Password");
        System.out.println(service.validatePassword("password")); // Expected:error
        
        // Test 5: Valid Phone Number
        System.out.print("Test 5: Valid Phone Number");
        System.out.println(service.validatePhoneNumber("0838968976")); // Expected: success
        
        // Test 6: Invalid Phone Numver
        System.out.println("Test 6: Invalid Phone Number");
        System.out.println(service.validatePhoneNumber("08966553")); // Expecteed: error
        
        // Test 7: Registration Success
        System.out.println("Test 7: Registration Success");
        boolean registered = service.registerUser("kyl_1", "Ch&&sec@ke99!", "0838968976");
        System.out.println("Registration status: " + registered); // Expected: false
        
        // Test 8: Registration Failure
        System.out.println("Test 8: Registration Failure");
        boolean failed = service.registerUser("kyle!!!!!!!", "password", "08966553");
        System.out.println("Registration status: " + failed); // Expected: false
        
        // Test 9: Message Simulation
        System.out.println("Test 9: Message Simulation");
        Message msgc = new Message("Hello, are you online?", "0838968976");
        msgc.markAsSent();
        msgc.markAsReceived();
        msgc.markAsRead();
        System.out.println(msgc.getStatusReport());
        
    }
}