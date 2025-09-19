/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.st10469706;

/**
 *
 * @author Njabulo Skondo
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserService service = new UserService();
        
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println(service.validateUsername(username));
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.println(service.validatePassword(password));
        
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();
        System.out.println(service.validatePhoneNumber(phone));
        
        if (service.registerUser(username, password, phone)) {
            System.out.println("Registration Successful!");
            System.outprintln("Login - Enter username: ");
            String loginUser = scanner.nextLine();
            System.out.print("Login - Enter password: ");
            String loginPass = scanner.nextLine();
            
            if (loginUser.equals(username) && loginPass.equals(password)) {
                System.out.println("Welcome Njabulo Skondo, it is greate to see yoy again.");
            } else {
                System.out.println("Username or password incorrect, please try again.");
        } 
            
        }else {
            System.out.println("Registration failed.Please check your inputs.");
        }
    }
