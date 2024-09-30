/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class Login {
  public String Password,Username,Firstname,Lastname;
public boolean checkingUser,checkingPass;

public Login(String Username, String Password, String Firstname, String Lastname)
{
    this.Password = Password;
    this.Username = Username;
    this.Firstname = Firstname;
    this.Lastname = Lastname;
 }
public boolean checkUserName(){
    //Statement determines if username meets all the conditions
    while(Username.length() >=5 || !Username.contains("_"))
    {
        Username = (JOptionPane.showInputDialog(null,"Username is not correctly formatted,please ensure your username contains an underscore" + "contains not more than 5 characters."));
    }
    //Statement returns the final results of the checkUsername method
    checkingUser = true;
    return checkingUser;
}
public boolean checkPasswordComplexity(){
    boolean PassDig = false;
    boolean PassSpecial = false;
    boolean PassUpper = false;
    while(Password.length()<8 || PassUpper == false || PassDig == false || PassSpecial == false)
    { 
      for (int i = 0; i < Password.length(); i++)
      {
          char SinglePass = Password.charAt(1);
          if(Character.isUpperCase(SinglePass))
          {
              PassUpper = true;
          }
          if(Character.isDigit(SinglePass))
          {
            PassDig = true;  
          }
          if(!Character.isLetter(SinglePass) || !Character.isDigit(SinglePass))
          {
              PassSpecial = true;
          }
      }
      Password = (JOptionPane.showInputDialog(null,"Password is not correctly formatted, please ensure that the password contains at least 8 characters" + "a special character" + "a capital character" +"and a number."));
    }
    checkingPass = true;
    return checkingPass;
}
public String registerUser()
{
    String Output = "";
    if(checkingUser == true && checkingPass == true)
    {
        Output = "Welcome" + Firstname + "," + Lastname + "it is great to see yo again.";
    }
    if(checkingUser == false || checkingPass == false)
    {
        Output = "Username or Password incorrect,please try again.";
    }
    return Output;
}
public boolean loginUser()
{
    String UsernameComp = Username;
    String PasswordComp = Password;
    do
    {
        UsernameComp = JOptionPan.showInputDialog("Please re-enter your username.");
        PasswordComp = JOptionPan.showInputDialog("Please re-enter your password.");
    }while (UsernameComp == Username || PasswordComp == Password);
    return true;
}


}

