package com.oop.UniversityManagementSys;

public class Teacher extends University {
    private String subject;

    public Teacher(int id, String name, String subject) {
        super(id,name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }




}
