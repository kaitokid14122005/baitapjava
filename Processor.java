/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentList studentList = new StudentList();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a new student");
            System.out.println("2. Update a student by ID");
            System.out.println("3. Delete a student by ID");
            System.out.println("4. Display all students");
            System.out.println("5. Find the student with the highest GPA");
            System.out.println("6. Exit");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (option) {
                case 1 -> {
                    System.out.println("Enter student ID:");
                    String id = scanner.nextLine();
                    System.out.println("Enter full name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter date of birth (dd-MM-yyyy):");
                    String dob = scanner.nextLine();
                    System.out.println("Enter GPA:");
                    float GPA = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.println("Major: ");
                    String major=scanner.nextLine();
                    try {
                        Date dateOfBirth = dateFormat.parse(dob);
                        Student student = new Student(GPA, major, id, name, dateOfBirth);
                        studentList.addStudent(student);
                    } catch (ParseException e) {
                        System.out.println("Invalid date format. Please try again."+e.getMessage());
                    }
                }

                case 2 -> {
                    System.out.println("Enter student ID to update:");
                    String updateId = scanner.nextLine();
                    System.out.println("Enter new full name:");
                    String newName = scanner.nextLine();
                    System.out.println("Enter new GPA:");
                    double newGpa = scanner.nextDouble();
                    studentList.updateStudent(updateId, newName, newGpa);
                }

                case 3 -> {
                    System.out.println("Enter student ID to delete:");
                    String deleteId = scanner.nextLine();
                    studentList.deleteStudent(deleteId);
                }

                case 4 -> studentList.displayAllStudents();

                case 5 -> {
                    Student topStudent = studentList.findHighestGpaStudent();
                    if (topStudent != null) {
                        System.out.println("Student with the highest GPA:");
                        topStudent.displayInfo();
                    }
                }

                case 6 -> {
                    System.out.println("Exiting...");
                    return;
                }

                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}


