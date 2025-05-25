package com.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n🧑🏻‍🎓 Student Management System:");
            System.out.println("===============================");
            System.out.println("1. Add a new student");
            System.out.println("2. Update a student");
            System.out.println("3. Display all students");
            System.out.println("4. Delete a student");
            System.out.println("5. Exit");
            System.out.print("Please select an option: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    Student student = Studentutility.addStudent();
                    studentList.add(student);
                    System.out.println("✅ Student added successfully.");
                    break;

                case 2:
                    Studentutility.UpdatebyId(studentList);
                    break;

                case 3:
                    Studentutility.Display(studentList);
                    break;

                case 4:
                    Studentutility.deleteById(studentList);
                    break;

                case 5:
                    System.out.println("👋 Exiting program. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("⚠️ Please enter a valid option.");
            }
        }
    }
}
