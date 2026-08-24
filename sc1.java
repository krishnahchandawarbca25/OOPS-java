/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

/**
 *
 * @author RVUW275
 */
public class sc1 {
    String name;
    String Usn;
    String course;
    
    student(String name, String Usn, String course){
        this.Usn = Usn;
        this.course = course;
        this.name = name;
        
    }
    void display(){
        System.out.println("usn:," +Usn);
        System.out.println("name:," +name);
        System.out.println("course:," +course);
    }
    public static void main(String[] args) {
        sc1 = new sc1("1BG23CS001", "Rahul", "Computer Science");
        sc1 = new sc1("1BG23CS001", "Raj", "computer science");
        Student1.display();
        Student2.display();        
    }
}
