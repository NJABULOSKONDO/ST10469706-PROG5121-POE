/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10469706;

/**
 *
 * @author Njabulo Skondo
 */

import java.util.Scanner;

public class MainLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserService service = new UserService();
        
        System.out.println("Welcome to the Chat App");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        if (!service.validateUsername(username).equals("Username successfully captured") ||
            !service.validatePassword(password).equals("Password successfully captured")) {
            System.out.println("Login failed. Please restart.");
            return;
        }
        
        int messageCount = 1;
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Send Message");
            System.out.println("2. Print All Messages");
            System.out.println("3. Print All Messages");
            System.out.println("4. Show Total Sent");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();
            
            switch (choice) {
                case "1":
                    System.out.print("Enter recipient  number: ");
                    String recipient = scanner.nextLine();
                    
                    System.out.print("Enter message: ");
                    String message = scanner.nextLine();
                    
                    MessageStatus msg = new MessageStatus(recipient, message, messageCount++);
                    System.out.println(msg.sentMessages("send"));
                    break;
                    
                Case "2":
                    System.out.print("Enter recipient number: ");
                    recipient = Scanner.nextLine();
                    
                    System.out.print("Enter message: ");
                    message = scanner.nextLine();
                    
                    MessageStatus msgStore = new MessageStatus(recipient, message, messageCount++);
                    System.out.println(msgStore.sentMessage("store"));
                    break;
                    
                Case "3":
                    System.out.println(MessageStatus.printMessage());
                    break;
                    
                Case "4": 
                    System.out.println("Total messages sent: " + MessageStatus.returnTotalMessage());
                    break;
                    
                Case "5":
                    System.out.println("Goodbye!");
                    return;
                
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
    
}
