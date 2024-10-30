/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trudie;
import java.util.*;
import java.util.regex.Pattern;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;



/**
 *
 * @author RC_Student_lab
 */
public class TRUDIE {
    private static boolean loggedIn = false;
    private static ArrayList<TaskClass> task = new ArrayList<>();
    public static void main(String[] args) {
        
   final JDialog dialog = new JDialog();
   dialog.setAlwaysOnTop(loggedIn);
   Login login = new Login();
    
   Scanner sc = new Scanner(System.in);
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
            
            boolean loginStats = login.LoginUser(loginUsername, loginPassword);
            //Display the login status message
            System.out.println(login.returnLoginStatus(loginStats));
            
        }
            
            
            //if(loginStats){
                //loggedIn = true;
                JOptionPane.showMessageDialog(null,"Welcome to EasyKanban");
                //part 2 starts here
                TaskClass task = new TaskClass();
             
               
                
                //Creating a menu using switch and cases that shows user has loggin successfully
                while (true){
                    String[] options = {"Add tasks", "Show report", "Quit"};
                    int choice = JOptionPane.showOptionDialog(null, "Please choose an option", "EasyKanban Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                   
                    switch (choice){
                        case 0 :
                            task.addTasks();
                            break;
                        case 1 :
                            JOptionPane.showMessageDialog(null, "Coming soon");
                            break;
                        case 2 :
                            JOptionPane.showMessageDialog(null, "Exiting EasyKanban. Goodbye");
                            return;
                        default:
                            return;
                            
                }
                  // Dialog.dispose(); 
                }
                                         
                // And ends here
                
            //}
        
        //sc.close();
    }
    
}