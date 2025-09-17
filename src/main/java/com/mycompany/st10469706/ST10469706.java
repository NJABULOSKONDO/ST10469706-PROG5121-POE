/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.st10469706;

/**
 *
 * @author Njabulo Skondo
 */
import java.util.Scanner;

public class ST10469706 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserService service = new UserService();
        
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println(service.validateUsername(username));
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.println(service.validatePassword(password));
        
        System.out.print("Enter South African number: ");
        String phone = scanner.nextLine();
        
        if (service.registerUser(username, password, phone)) {
            System.out.println("Registration Successful!");
        } else {
            System.out.println("Registration failed. Please check your inputs.");
        }
    }
}
