/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labprog;

/**
 *
 * @author RVUW275
 */
public class Recharge {
   
    
    private String planName;
    private double basePrice;

    
    public Recharge() {
        this.planName = "Standard Data Plan";
        this.basePrice = 199.00;
    }

   
    public Recharge(String planName, double basePrice) {
        this.planName = planName;
        this.basePrice = basePrice;
    }

   
    public double calculateAmount(int talktimeAmount) {
        return this.basePrice + talktimeAmount;
    }

    
    public double calculateAmount(int talktimeAmount, double gstRate) {
        double totalTalktime = talktimeAmount + (talktimeAmount * gstRate);
        return this.basePrice + totalTalktime;
    }

  
    public void displayPlan() {
        System.out.println("Plan: " + planName + " | Base Price: " + basePrice);
    }

   
    public static void main(String[] args) {
   
        System.out.println("--- Default User ---");
        Recharge defaultUser = new Recharge();
        defaultUser.displayPlan();
        
        
        double simpleTotal = defaultUser.calculateAmount(100);
        System.out.println("Total Amount (Flat 100 Rs Top-up): " + simpleTotal);

        System.out.println("\n--- Custom User ---");
     
        Recharge customUser = new Recharge("Premium Unlimited Plan", 499.00);
        customUser.displayPlan();
        
 
        double gstTotal = customUser.calculateAmount(100, 0.18);
        System.out.println("Total Amount (100 Rs Top-up + 18% GST): " + gstTotal);
    }
}

