package com.student_management;

import java.util.ArrayList;
import java.util.List;

public class Student_Management {
	
    private List<Student> students;

    
    public Student_Management() {
        students = new ArrayList<>();
    }

    
    public void addStudent(Student student) {
        students.add(student);
    }

    
    public boolean removeStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                students.remove(student);
                return true;
            }
        }
        return false; 
    }

    
    public Student searchStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null; 
    }

   
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
