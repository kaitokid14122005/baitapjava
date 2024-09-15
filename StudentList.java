/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap6;

import java.util.ArrayList;


public class StudentList {

    private final ArrayList<Student> students;

    public StudentList() {
        this.students = new ArrayList<>();
    }

    // Add a new Student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // Update a Student by ID
  public void updateStudent(String id, String newFullname, double newGPA) {
    for (Student student : students) {
        if (student.getId().equals(id)) {
            student.setFullname(newFullname);
            student.setGPA((float) newGPA); // Ép kiểu từ double sang float
            System.out.println("Student updated successfully!");
            return;
        }
    }
    System.out.println("Student not found!");
}
    // Delete a Student by ID
    public void deleteStudent(String id) {
        students.removeIf(student -> student.getId().equals(id));
        System.out.println("Student deleted successfully!");
    }

    // Display all students
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            for (Student student : students) {
                student.displayInfo();
                System.out.println("-----------");
            }
        }
    }

    // Find the Student with the highest GPA
    public Student findHighestGpaStudent() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
            return null;
        }

        Student topStudent = students.get(0);
        for (Student student : students) {
            if (student.getGPA() > topStudent.getGPA()) {
                topStudent = student;
            }
        }

        return topStudent;
    }
}
