/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author Njabulo Skondo
 */

package com.mycompany.st10469706;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();
        boolean running = true;
        
    while (running) {
       String menu = "Welcome to the Message App!\n"
                   + "1. Add Message\n"
                   + "2. View Message\n"
                   + "3. Exit";
       String choice = JOptionPane.showInputDialog(menu);
       
       switch (choice) {
           case "1":

               String countInput = JOptionPane.showInputDialog("How many messages would you like to send?");
               int count = Integer.parseInt(countInput);
               
               for (int i = 0; i < count; i++) {
                   String recipient = JOptionPane.showInputDialog("Enter recipient number (e.g. +27831234567)");
                   String message = JOptionPane.showInputDialog("Enter your message:");
                   int messageCount = i + 1;
                   
                   MessageStatus msg = new MessageStatus(recipient, message, messageCount);
                   JOptionPane.showMessageDialog(null, msg.sentMessages("send"));
                   JOptionPane.showMessageDialog(null, "Message Hash: " + msg.createMessageHash());
               }
               JOptionPane.showMessageDialog(null, "Total Message Sent: " + MessageStatus.returnTotalMessage());
               break;
           case "2":
               JOptionPane.showMessageDialog(null, MessageStatus.printMessage());
               break;
               
           case "3":
               JOptionPane.showMessageDialog(null, "Goodbye!"); // Updated for rubric compliance
               running = false;
               break;
               
           default:
               JOptionPane.showMessageDialog(null, "Invalid option. Please choose 1, 2, or 3.");
       }    
    }
  }    
}