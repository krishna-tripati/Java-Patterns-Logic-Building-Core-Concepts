package com.oop.UniversityManagementSys;

public class University {
    private int Id;
    private String Name;

    public University(int id, String name) {
        Id = id;
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public int getId() {
        return Id;
    }



}
