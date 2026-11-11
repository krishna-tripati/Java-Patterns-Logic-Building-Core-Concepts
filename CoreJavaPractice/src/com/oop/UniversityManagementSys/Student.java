package com.oop.UniversityManagementSys;

public class Student extends University {

    private String Course;

    public Student(int id, String name, String course) {
        super(id,name);
         this.Course = course;
    }

    public String getCourse() {
        return Course;
    }




}
