package com.oop.UniversityManagementSys;

public class StudeEntrollData {

  private   Student s;
  private   Teacher t;
  private   Course c;

    public StudeEntrollData(Course c, Teacher t, Student s) {
        this.c = c;
        this.t = t;
        this.s = s;
    }

    public Student getS() {
        return s;
    }

    public Teacher getT() {
        return t;
    }

    public Course getC() {
        return c;
    }
}
