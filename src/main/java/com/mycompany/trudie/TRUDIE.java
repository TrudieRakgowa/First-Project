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
        login second = new login();
        Scanner sc = new Scanner(System.in);
        
        
        //Declarations
        String Username, FirstName,LastName,Password;
        
        //Prompt user to enter details
        do{
        System.out.println("Enter Username");
        Username = sc.next();
        }while(second.Username(Username));
        
         System.out.println("Enter FirstName");
         FirstName = sc.next();
         
         System.out.println("Enter LastName");
         LastName = sc.next();
         
         do{
             System.out.println("Enter Password: ");
             Password = sc.next();
         }
         while(!second.checkPassword(Password));
         
         
        
         }
        
    }
}
