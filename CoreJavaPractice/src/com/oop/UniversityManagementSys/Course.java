package com.oop.UniversityManagementSys;


public class Course extends University {

   private double CourseFees;

    public Course(int id, String courname, double courseFees) {
        super(id,courname);
        CourseFees = courseFees;
    }

    public double getCourseFees() {
        return CourseFees;
    }
}
