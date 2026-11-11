package com.oop.Emp;

public class EmpTest {
    public static void main(String[] args) {

        Developer dev=new Developer(101,"krishna T", 30000);
        Tester test=new Tester(102, "Nishant M", 20000);
        projManager manager =new projManager(103, "Soham T", 40000);

        dev.displyempInfo();
        System.out.println();
        test.displyempInfo();
        System.out.println();
        manager.displyempInfo();
        System.out.println();
        System.out.println("Developer Gross salary: "+dev.CalculateSalary());
        System.out.println("Tester Gross salary: "+test.CalculateSalary());
        System.out.println("Project manager Gross salary: "+manager.CalculateSalary());


    }
}
