package org.example.que1;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(
                "Sofiya",
                642403019,
                "sofiyarukadiakr@gmail.com",
                LocalDate.of(2004, 5, 11),
                75000000,
                "1234-5678-9012",
                7,
                "Computer Engineering"
        );

        emp.getDetails();
        System.out.println("***********************************************************************************************");
        emp.calculateTax();
        System.out.println("***********************************************************************************************");
        emp.performanceEvaluation();
        }
    }
