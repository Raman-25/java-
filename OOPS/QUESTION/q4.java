package com.java.OOPS;

class newEmployee {
    int salary;
    String name;

    // Default constructor (no arguments)
    newEmployee() {
        salary = 10000;  // default salary
        name = "Unknown"; // optional default
    }

    // Parameterized constructor
    newEmployee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class q4 {
    public static void main(String[] args) {
        // Using default constructor
        newEmployee e1 = new newEmployee();
        System.out.println("Employee: " + e1.name + ", Salary: Rs " + e1.salary);

        // Using parameterized constructor
        newEmployee e2 = new newEmployee("Ramandeep Singh", 5000);
        System.out.println("Employee: " + e2.name + ", Salary: Rs " + e2.salary);
    }
}
