package com.java.OOPS;
import java.util.Scanner;

class Employee{
    int salary;
    String name;
    String new_name;

    public String getname() {
        return name;
    }
    public void getsalary(){
        System.out.println("My salary is " + salary);
    }
    public void setname(String new_name){
        name = new_name;
    }

}
public class Q1 {
    public static void main(String[] args) {
        Employee Raman = new Employee();
        Raman.salary= 5000;
        Raman.name = "Ramandeep singh";
        Raman.setname("Dev");
        System.out.println(Raman.getname());
        Raman.getsalary();
    }

}
