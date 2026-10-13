/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author 292024
 */
public class NestedLoginValidator {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String correctUsername = "admin";
        String correctPassword = "admin123";
        boolean isAccountLocked = false;
        
        String enteredUsername = "admin";
        String enteredPassword = "admin123";
        
        if (enteredUsername.equals (correctUsername)) {
            
            if (enteredPassword.equals(correctUsername)) {
                
                if (enteredPassword.equals(correctPassword)) {
            
                    if (isAccountLocked){
                        
                        System.out.println ("Login Successful! Welcome, " + enteredUsername);
                        
                    }else{
                        System.out.println ("Login Failed: Account is locked. Contact support"); }
                }else{
                    System.out.println ("Login Failed: Incorrect password."); }
                
            }else {
                System.out.println ("Login Failed: Username not found.");
                        
                    }
                }
            }
        }
        
        
        
    
    

