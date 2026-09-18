/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance;

/**
 *
 * @author chand
 */
class Vehicle {
    private String registrationNumber;
    private String model;
    private double rentalRate;

    public Vehicle(String registrationNumber, String model, double rentalRate) {
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public String getRegistrationNumber() { return registrationNumber; }
    public String getModel() { return model; }
    public double getRentalRate() { return rentalRate; }

    public void displayInfo() {
        System.out.printf("Vehicle     : %s (%s)%n", model, registrationNumber);
        System.out.printf("Base Rate   : $%.2f/day%n", rentalRate);
    }
}
class Car extends Vehicle {
    private int seats;
    private String fuelType;

    public Car(String registrationNumber, String model, double rentalRate, int seats, String fuelType) {
        super(registrationNumber, model, rentalRate);
        this.seats = seats;
        this.fuelType = fuelType;
    }

    public int getSeats() { return seats; }
    public String getFuelType() { return fuelType; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Specs       : %d seats | %s%n", seats, fuelType);
    }
}
class LuxuryCar extends Car {
    private boolean includesChauffeur;
    private double premiumFee;

    public LuxuryCar(String registrationNumber, String model, double rentalRate, 
                     int seats, String fuelType, boolean includesChauffeur, double premiumFee) {
        super(registrationNumber, model, rentalRate, seats, fuelType);
        this.includesChauffeur = includesChauffeur;
        this.premiumFee = premiumFee;
    }

    public double calculateTotalCost(int days) {
        return (getRentalRate() + premiumFee) * days;
    }

    public void printRentalReceipt(int days) {
        System.out.println("\n--- RENTAL SUMMARY ---");
        displayInfo();
        System.out.printf("Chauffeur   : %s%n", includesChauffeur ? "Included" : "Not Requested");
        System.out.printf("Premium Fee : $%.2f/day%n", premiumFee);
        System.out.println("----------------------");
        System.out.printf("Duration    : %d days%n", days);
        System.out.printf("Total Due   : $%.2f%n", calculateTotalCost(days));
        System.out.println("----------------------\n");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        LuxuryCar ride = new LuxuryCar(
            "VIP-777", 
            "BMW 7 Series", 
            200.00, 
            5, 
            "Hybrid", 
            true, 
            80.00
        );
        ride.printRentalReceipt(3);
    }
}