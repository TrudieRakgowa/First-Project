/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trudie;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class TRUDIE {
public String Uname, Fname,Lname,Pass;


    public static void main(String[] args) {
    new TRUDIE();
    
    }
    public TRUDIE(){
      String Fname = (JOptionPane.showInputDialog("Please enter your Firstname."));
      String Lname = (JOptionPane.showInputDialog("Please enter your Lastname."));
      String Uname = (JOptionPane.showInputDialog("Please enter your Username that must contain no more than 5 characters"+ "should contain an underscore."));
      String Pass = (JOptionPane.showInputDialog("Please enter your Password."));
      boolean checkname = false;
      boolean checkpassword = false;
      Login Login2 = new Login(Uname,Fname,Lname,Pass);
      Login2.checkPasswordComp();
    }
    }

