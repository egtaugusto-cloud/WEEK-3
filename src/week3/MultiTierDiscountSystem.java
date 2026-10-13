/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author 292024
 */
public class MultiTierDiscountSystem {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       double purchaseAmount = 1500.0;
       
double discountPercent = 0;

if (purchaseAmount >= 2000) {
    discountPercent = 15; }

else if (purchaseAmount >= 1000) {
        discountPercent = 10; }

else if (purchaseAmount >= 500) {
    discountPercent = 5;
 
  
            } else {
            discountPercent = 0;
    }
    
    double finalPrice = purchaseAmount - (purchaseAmount * discountPercent / 100);
    
    System.out.println ("Purchase Amount: " + purchaseAmount);
    System.out.println ("Discount Tier: " + discountPercent + "%");
    System.out.println ("Final Price: " + finalPrice); 

}
    }
