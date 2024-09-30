/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.trudie;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {
    
    private Login login;

    
    @BeforeEach
    public void setUp() {
//Initialize a new login instace before each test
login = new Login();
    }
    
    
    @AfterEach
    public void tearDown() {
        //Clean up after each test if necessary
        login = null;
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @org.junit.jupiter.api.Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        String result = login.registerUser("user_","Pass123#", "Tee", "Smith");
        assertEquals("Username and Password succeefully captued.", result, "Registrations should be successfully");
        //test
        result = login.registerUser("user_", "password", "Tee", "Smith");
        assertEquals("Password is not correctly formatted, ensure that username contain, at least 8 characters, an underscore and speacial character");
        
        
    }
    /**
     * Test of LoginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        //Register a user first
        login.registerUser("user_", "Pass123#", "Tee", "Smith");
        //test for vaild login
        assertTrue(login.loginUser("user", "Pass123#"), "Login should succed with valid credentials");
        //test for invalid username  
        assertFalse(login.loginUser("wrong_user", "Pass123#"),"Login should failwith incorrect username");
       //test for invaild password
       assertFalse(login.loginUser("user_", "WrongPass"),"Login should fail with incorrect password");
       
    }    
    @Test
    public void testReturnLoginStatus() {
        //Register a user first
        login.registerUser("user_","Pass123#","Tee","Smith");
        //test for valid login
        assertEquals("Welcome Tee Smith, it is great to see you again.", login.returnLoginStatus("user_", "Pass123#"),"Login is successful");
        //test for invaild login
        assertEquals("Username or Password is incorrect,please try again.", login.returnLoginStatus("user_", "WrongPass"),"Login is unsuccessful");
    }
        @Test
    public void testLoginUser() {
     //Register a user first
        login.registerUser("user_", "Pass123#", "Tee", "Smith");
        //test for vaild login
        assertTrue(login.loginUser("user", "Pass123#"), "Login should succed with valid credentials");
        //test for invalid username  
        assertFalse(login.loginUser("wrong_user", "Pass123#"),"Login should failwith incorrect username");
       //test for invaild password
       assertFalse(login.loginUser("user_", "WrongPass"),"Login should fail with incorrect password");
             
    }

    private void assertEquals(String password_is_not_correctly_formatted_ensur) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertEquals(String username_and_Password_succeefully_captued, String result, String registrations_should_be_successfully) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertEquals(boolean expResult, boolean result) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
