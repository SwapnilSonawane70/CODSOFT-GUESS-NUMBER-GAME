package com.student_management;

import java.util.Scanner;

public class Student_Managent_App {
	
    public static void main(String[] args) {
    	
        Student_Management system = new Student_Management();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    System.out.print("Enter grade: ");
                    String grade = scanner.next();
                    system.addStudent(new Student(name, rollNumber, grade));
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    System.out.print("Enter roll number to remove: ");
                    rollNumber = scanner.nextInt();
                    if (system.removeStudent(rollNumber)) {
                        System.out.println("Student removed successfully!");
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                case 3:
                    System.out.print("Enter roll number to search: ");
                    rollNumber = scanner.nextInt();
                    Student student = system.searchStudent(rollNumber);
                    if (student != null) {
                        System.out.println("Student found: " + student);
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                case 4:
                    system.displayAllStudents();
                    break;
                case 5:
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
