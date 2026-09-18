/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inherit;

/**
 *
 * @author RVUW275
 */
package inherit;

public class Person {
    String name;
    int contact;
    public Person(String name, int contact) { 
        this.name = name;
        this.contact = contact;
    }
    public void display() {
        System.out.println("Name is: " + name);
        System.out.println("Contact no: " + contact);
    }
}

class Student extends Person {
    int USN;
    String program;
    String semester;

    Student(String name, int contact, int USN, String program, String semester) {
        super(name, contact);
        this.USN = USN;
        this.program = program;
        this.semester = semester;
    }
    @Override
    public void display() {
        super.display(); 
        System.out.println("USN: " + USN);
        System.out.println("Program enrolled in: " + program);
        System.out.println("Current semester: " + semester);
    }
}

class ResearchStudent {
    String researchArea;
    String guideName;

    ResearchStudent(String researchArea, String guideName) {
        this.guideName = guideName;
        this.researchArea = researchArea;
    }
    public void display() {
        System.out.println("Name of Guide: " + guideName);
        System.out.println("Area of research: " + researchArea);
    }
}

class MainDriver {
    public static void main(String[] args) {

        Student s = new Student("Alice", 123456, 101, "Computer Science", "3rd");
        s.display();
    }
}
