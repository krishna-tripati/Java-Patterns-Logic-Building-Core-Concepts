package com.oop.Emp;

public class projManager extends EmpInfo{


    public projManager(int empId, String name, double basicSalary) {
        super(empId, name, basicSalary);
    }

    private double technicalallowance=6000;
    private double travelallowane=3000;
    private double internetallowance=1000;

    @Override
    public double CalculateSalary(){
        return  technicalallowance + travelallowane + internetallowance + getBasicSalary();

    }
}
