/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap6;

import java.util.Date;

/**
 *
 * @author bao
 */
public class Student extends Person {

    private float GPA;
    private String major;

    

    public Student(float GPA, String major, String id, String fullname, Date dateOfBirth) {
        super(id, fullname, dateOfBirth);
        this.GPA = GPA;
        this.major = major;
    }


    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

//phai khai bao public void displayInfo
    
    public void addStudent(){
        
    }
      @Override
    public void displayInfo() {
            System.out.println("Student ID: " + getId());
        System.out.println("Full Name: " + getFullname());
        System.out.println("Date of Birth: " + getDateOfBirth());
        System.out.println("GPA: " + GPA);
    }
}
