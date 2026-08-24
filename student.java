/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author RVUW275
 */
public class student {
    String Usn;
    String name;
    String course;
    
    student(String usn, String name, String course){
        this.Usn = Usn;
        this.name = name;
        this.course = course;
    }
    void display(){
        System.out.println("USN:", +Usn);
        System.out.println("name:", +name);
        System.out.println("course:", +course);
        
    }
     public static void main(String[] args) {
  
        Student student1 = new Student("1BG23CS001", "Rahul", "Computer Science");
        Student student2 = new Student("1BG23CS002", "Raj", "Computer Science");
        
        Student1.display();
        Student2.display();        
        
}
}

