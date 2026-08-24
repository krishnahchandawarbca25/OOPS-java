/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

/**
 *
 * @author RVUW275
 */
public class sc2 {import java.util.List;
import java.util.ArrayList;

class Student {
    String studentId;
    String name;
    List<String> courses;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public Student(String studentId, String name, List<String> courses) {
        this.studentId = studentId;
        this.name = name;
        this.courses = courses;
    }
}

    
}
