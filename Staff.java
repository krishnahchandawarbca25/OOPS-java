/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author chand
 */
public class Staff {
    private String staffId;
    private String name;
    private double basicSalary;

    public Staff(String staffId, String name, double basicSalary) {
        this.staffId = staffId;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    public String getStaffId() { return staffId; }
    public String getName() { return name; }
    public double getBasicSalary() { return basicSalary; }
    public double calculateEarnings() {
        return basicSalary;
    }
    public void displayInfo() {
        System.out.printf("Staff ID     : %s%n", staffId);
        System.out.printf("Name         : %s%n", name);
        System.out.printf("Basic Salary : $%.2f%n", basicSalary);
    }
}
class Doctor extends Staff {
    private String specialization;
    private double consultationFee;
    private int consultationsCount;
    public Doctor(String staffId, String name, double basicSalary, 
                  String specialization, double consultationFee, int consultationsCount) {
        super(staffId, name, basicSalary);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
        this.consultationsCount = consultationsCount;
    }
    @Override
    public double calculateEarnings() {
        return getBasicSalary() + (consultationFee * consultationsCount);
    }
    @Override
    public void displayInfo() {
        System.out.println("=== DOCTOR DETAILS ===");
        super.displayInfo();
        System.out.printf("Specialization: %s%n", specialization);
        System.out.printf("Consult Fee   : $%.2f%n", consultationFee);
        System.out.printf("Consultations : %d%n", consultationsCount);
        System.out.printf("Total Earnings: $%.2f%n", calculateEarnings());
        System.out.println();
    }
}
class Nurse extends Staff {
    private String wardName;
    private double shiftAllowance; // Allowance per night/extra shift
    private int nightShiftsWorked;
    public Nurse(String staffId, String name, double basicSalary, 
                 String wardName, double shiftAllowance, int nightShiftsWorked) {
        super(staffId, name, basicSalary);
        this.wardName = wardName;
        this.shiftAllowance = shiftAllowance;
        this.nightShiftsWorked = nightShiftsWorked;
    }
    @Override
    public double calculateEarnings() {
        return getBasicSalary() + (shiftAllowance * nightShiftsWorked);
    }
    @Override
    public void displayInfo() {
        System.out.println("=== NURSE DETAILS ===");
        super.displayInfo();
        System.out.printf("Ward Name     : %s%n", wardName);
        System.out.printf("Shift Rate    : $%.2f%n", shiftAllowance);
        System.out.printf("Shifts Worked : %d%n", nightShiftsWorked);
        System.out.printf("Total Earnings: $%.2f%n", calculateEarnings());
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        Doctor doc = new Doctor(
            "DOC-101", 
            "Dr. Sarah Lin", 
            5000.00, 
            "Cardiology", 
            75.00, 
            24 
        );
        Nurse nurse = new Nurse(
            "NRS-204", 
            "James Miller", 
            3200.00, 
            "Pediatrics ICU", 
            50.00, 
            8 
        );
        doc.displayInfo();
        nurse.displayInfo();
    }
}
