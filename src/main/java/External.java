/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.regex.Pattern;
/**
 *
 * @author RC_Student_lab
 */
public class External {
   
    
    
    public boolean checkPassword(String pass){
    String regex ="'(?=.[a-z])(?=.[A-B])(?=.\\d)(/=.[@$!%*#/&]).{8,}$";
    boolean check = false;
    
    if (pass.matches(regex)){
        System.out.println("Password is incorrect please ensure that password contains 8 characters,Capital letter,a number and special charater");
        check = false;
    }
    else{
        System.out.println("Password successful");
        check = true;
    }
    return check;
    
}
    public boolean User(String user){
        boolean check = false;
        if (user.contains("_")&& user.length()<=5){
            System.out.println("Username successful");
        }
        else{
            System.out.println("Userame is incorrect please ensure username contains an underscore and is not more than 5 charaters");
        }
        return check;
    }
    public void registerUser(){
      String Username ="Tee_";
      String Password ="Trudie#05" ;
      
      if (Username.equals("Tee_")&& Password.equals("Trudie#05")){
          System.out.println("Welcome <user FirstName>,<user LastName> it is great to see you");
           }
      else{
          System.out.println("Username or Password is incorrect try again");
      }
    }
}
