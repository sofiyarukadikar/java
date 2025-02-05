package org.example.que1;

import java.time.LocalDate;
import java.util.UUID;

public class Person {
    private String name;
    private int code;
    private String email;
    private LocalDate dateOfBirth;

    public Person(String name, int code, String email, LocalDate dateOfBirth) {
        this.name = name;
        this.code = code;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Unique Code: " + code);
        System.out.println("Email: " + email);
    }

    public int getCode() {
        return code;
    }
}

class Account extends Person {
    private double salary;
    private String bankAccount;
    private UUID accountId;

    public Account(String name, int code, String email, LocalDate dateOfBirth,
                   double salary, String bankAccount) {
        super(name, code, email, dateOfBirth);
        this.salary = salary;
        this.bankAccount = bankAccount;
        this.accountId = UUID.randomUUID();
    }

    public void calculateTax() {
        double tax = salary * 0.2; // 20% tax rate
        System.out.println("Tax Calculation: $" + tax);
    }
}

class Admin extends Person {
    private int yearsOfExperience;
    private String[] permissions;

    public Admin(String name, int code, String email, LocalDate dateOfBirth,
                 int yearsOfExperience, String[] permissions) {
        super(name, code, email, dateOfBirth);
        this.yearsOfExperience = yearsOfExperience;
        this.permissions = permissions;
    }

    public void displayAdminRights() {
        System.out.println("Admin Experience: " + yearsOfExperience + " years");
        System.out.print("Permissions: ");
        for (String permission : permissions) {
            System.out.print(permission + " ");
        }
        System.out.println();
    }
}

class Employee extends Account {
    private int experience;
    private String department;

    public Employee(String name, int code, String email, LocalDate dateOfBirth,
                    double salary, String bankAccount,
                    int experience, String department) {
        super(name, code, email, dateOfBirth, salary, bankAccount);
        this.experience = experience;
        this.department = department;
    }

    public void getDetails() {
        super.displayInfo();
        System.out.println("Experience: " + experience + " years");
        System.out.println("Department: " + department);

    }
public void code(){
    System.out.println(this.getCode());
}

    public void performanceEvaluation() {
        String rating = experience > 5 ? "Excellent" : "Good";
        System.out.println("Performance Rating: " + rating);
    }
}

