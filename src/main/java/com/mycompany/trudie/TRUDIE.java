/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trudie;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class TRUDIE {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Login login = new Login();
    
    //Registration process
        System.out.println("===User Registration===");
        System.out.println("Enter first name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter your name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter username(must contain an underscore and be no more than 5 characters):");
        String username = sc.nextLine();
        System.out.println("Enter password (must bee at least 8 character,containa capital letter,a number,and a special character):");
        String password = sc.nextLine();
        
        //Register the user and display the result
        String registrationResult = login.registerUser(username, password, firstName, lastName);
        System.out.println(registrationResult);
        //If registration is successful, proceed to login
        if(registrationResult.equals("Username and password successfully captured.")){
            System.out.println("\n===User Login ===");
            System.out.println("Enter username: ");
            String loginUsername = sc.nextLine();
            System.out.println("Enter password: ");
            String loginPassword = sc.nextLine();
            
            //Display the login status message
            System.out.println(login.returnLoginStatus(loginUsername, loginPassword));
        }
        sc.close();
    }
    
}