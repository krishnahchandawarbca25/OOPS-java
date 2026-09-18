/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package inherit;

import javax.lang.model.SourceVersion;

/**
 *
 * @author RVUW275
 */




class Inherit1 {
    int empId;
    String name;
    double basicSalary;

    Inherit1(String name, int empId, double basicSalary) {
        this.name = name;
        this.empId = empId;
        this.basicSalary = basicSalary;
    }

    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Basic Salary: " + basicSalary);
    }

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }
}


class Manager extends Inherit1 {
    String department; 
    double performanceBonus;

    public Manager(int empId, String name, double basicSalary, String department, double performanceBonus) {
 
        super(name, empId, basicSalary); 
        this.department = department;
        this.performanceBonus = performanceBonus;
    }


    public void displayFinalSalary() {
        double finalSalary = basicSalary + performanceBonus;
        display(); 
        System.out.println("Department : " + department);
        System.out.println("Performance Bonus : " + performanceBonus);
        System.out.println("Final Salary : " + finalSalary);
        System.out.println("-----------------------------------");
    }
}

public class Inherit {
    public static void main(String[] args) {
        Manager mgr = new Manager(101, "Alice Smith", 75000.0, "Engineering", 15000.0);
        mgr.displayFinalSalary();
    }
}

    



