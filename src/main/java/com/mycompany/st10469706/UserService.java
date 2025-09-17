/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10469706;

/**
 *
 * @author Njabulo Skondo
 */
public class UserService {
   
    public String validateUsername(String username) {
        if (username.contains("_") && username.length() <= 5){
            return "Username successfully captured.";
        } else {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";            
        }
    }
    public String validatePassword(String password) {
        boolean hasUpper = password.matches(".*[A-Z].*");
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecial = password.matches(".*[!@#$%^&*(),.?\"{}|<>].*");
        boolean longEnough = password.length() >= 8;
        
        if (hasUpper && hasDigit && hasSpecial && longEnough){
            return "Password successfully captured.";
        } else {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
    }
    public boolean registerUser(String username, String password, String phoneNumber) {
        // You can add phone number validation here too
        return validateUsername(username).contains("successfully")&&
                validatePassword(password).contains("successfully");
    }
    public String validatePhoneNumber(String phoneNumber) {
        if (phoneNumber.matches("0\\d{9}")) {
            return "Phone number successfully captured.";
        } else {
            return "Phone number is not correctly formatted; please enter a valid 10-digit South African cell number starting with 0.";
        }
    }
}
