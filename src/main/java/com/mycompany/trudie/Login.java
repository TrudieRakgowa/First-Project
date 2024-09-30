/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trudie;

/**
 *
 * @author RC_Student_lab
 */
class Login {
    private String firstname;
    private String lastname;
    private String registeredUsername;
    private String registeredPassword;
    
    //
    public boolean checkUserName(String username){
    return username.contains("_") && username.length()<=5;
}
    //method to check if the password meets complexity requirements
    public  boolean checkPasswordComplexity(String password){
        if (password.length() <8){
            return false;
        }
        boolean hasUpperCase = false,hasNumber = false, hasSpecialChar = false;
        for (char ch : password.toCharArray()){
            if (Character.isUpperCase(ch)){
                hasUpperCase = true;
            }
            else if (Character.isDigit(ch)){
                hasNumber = true;
            }
            else if (!Character.isLetterOrDigit(ch)){
                hasSpecialChar = true;
            }
        }
        return hasUpperCase && hasSpecialChar;
    }
    //method to register a user with a username,password,firstname and lastname
    public String registerUser(String username, String password, String firstName,String lastName){
        if(checkUserName(username)&& checkPasswordComplexity(password)){
            this.registeredUsername = username;
            this.registeredPassword = password;
            this.firstname = firstname;
            this.lastname = lastname;
            return"Username and password successfully captured.";
        }else
        {
            if(!checkUserName(username)){
                return"Username is not correctly formatted,please ensure that your username contains an underscoreand is not more than 5 characters.";
            }
            if(!checkPasswordComplexity(password)){
                return"Password is not correctly formatted, please ensure that the password contains at least 8 characters, a special character,a capital character, and a number.";
            }
            return" Registration failed due to incorrrrect username or passwordformat.";
        }
    }
    //method to log in a user by checking entered usernameand password against the registered detail
    public boolean LoginUser(String username, String password){
        return username.equals(registeredUsername)&& password.equals(registeredPassword);
    }
    //method to return the login status message
    public String returnLoginStatus(String username, String password){
        if (loginUser(username,password)){
            return"Welcome" + firstname + "_" + lastname + "it is great to see you again.";
        }  
        return null;
    }

    public boolean loginUser(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    }
}

    
