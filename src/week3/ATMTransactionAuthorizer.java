/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author 292024
 */
public class ATMTransactionAuthorizer {
    
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String Username = "Augusto"; 
        String Password = "1234";

        String correctUsername = "Augusto";
        String correctPassword = "1234";

        double balance = 25000;
        double withdrawal = 5000;
        
        
        String tier = "";
        double dailyLimit = 0;
        double feePercent = 0;
        double totalDeduction = 0;

       
        if (Username.equals(correctUsername)) {
            if (Password.equals(correctPassword) && Password.length() == 4) {
                
                System.out.println("Login successful");

               
                if (balance >= 50000) {
                    tier = "Platinum";
                    dailyLimit = 20000;
                } else if (balance >= 15000) {
                    tier = "Gold";
                    dailyLimit = 10000;
                } else if (balance >= 5000) {
                    tier = "Silver";
                    dailyLimit = 5000;
                } else {
                    tier = "Bronze";
                    dailyLimit = 1000;
                }

               
                switch (tier) {
                    case "Bronze": feePercent = 3.0; break;
                    case "Silver": feePercent = 2.0; break;
                    case "Gold": feePercent = 1.0; break;
                    case "Platinum": feePercent = 0.0; break;
                }

                double fee = withdrawal * feePercent / 100;
                totalDeduction = withdrawal + fee;

               
                if (totalDeduction <= balance) {
                    if (withdrawal <= dailyLimit) {
                        System.out.println("APPROVED");
                        System.out.println("Tier: " + tier);
                        System.out.println("Withdrawal: ₱" + withdrawal);
                        System.out.println("Fee (" + feePercent + "%): ₱" + fee);
                        System.out.println("New Balance: ₱" + (balance - totalDeduction));
                    } else {
                        System.out.println("DENY - Reason: Exceeds daily limit for " + tier + " tier (₱" + dailyLimit + ")");
                    }
                } else {
                    System.out.println("DENY - Reason: Insufficient balance. Need ₱" + totalDeduction + " but have ₱" + balance);
                }

            } else {
                System.out.println("DENY - Reason: Invalid PIN. Must be 4-digit.");
            }
        } else {
            System.out.println("DENY - Reason: Invalid username.");
        }
    }
}

    
        