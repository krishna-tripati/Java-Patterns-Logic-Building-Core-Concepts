package com.oop.Emp;

public abstract class EmpInfo {
    private int empId;
    private String name;
    private double basicSalary;

    public EmpInfo(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public void displyempInfo(){
        System.out.println("Emp Id: "+empId);
        System.out.println("Emp Name: "+name);
        System.out.println("Emp basic salary: "+basicSalary);

    }

    public double getBasicSalary() {
        return basicSalary;
    }

     public abstract double CalculateSalary();

}
