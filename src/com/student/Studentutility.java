package com.student;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Studentutility {

    static Scanner sc = new Scanner(System.in);

    // 1. Add a new student
    public static Student addStudent() {
        Student s = new Student();

        System.out.print("Enter student ID: ");
        s.setStuId(sc.nextInt());
        sc.nextLine(); // Consume leftover newline

        System.out.print("Enter student name: ");
        s.setName(sc.nextLine());

        System.out.print("Enter student age: ");
        s.setAge(sc.nextInt());

        return s;
    }

    // 2. Display all students
    public static void Display(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("⚠️ No students found.");
            return;
        }

        System.out.println("\n📋 Student List:");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    // 3. Update a student by ID
    public static void UpdatebyId(List<Student> students) {
        System.out.print("Enter ID of student to update: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline

        boolean found = false;

        for (Student s : students) {
            if (s.getStuId() == id) {
                System.out.print("Enter new name: ");
                s.setName(sc.nextLine());

                System.out.print("Enter new age: ");
                s.setAge(sc.nextInt());

                System.out.println("✅ Student updated successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("❌ Student with ID " + id + " not found.");
        }
    }

    // 4. Delete a student by ID
    public static void deleteById(List<Student> students) {
        System.out.print("Enter ID of student to delete: ");
        int id = sc.nextInt();

        Iterator<Student> iterator = students.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getStuId() == id) {
                iterator.remove();
                System.out.println("🗑️ Student deleted successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("❌ Student with ID " + id + " not found.");
        }
    }
}
