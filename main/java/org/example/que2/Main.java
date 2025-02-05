package org.example.que2;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    private static LocalDateTime now = LocalDateTime.now();
    private static LocalDate today = LocalDate.now();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    displayCurrentDateTime();
                    break;
                case 2:
                    displayCurrentDate();
                    break;
                case 3:
                    displayCurrentYear();
                    break;
                case 4:
                    displayCurrentMonth();
                    break;
                case 5:
                    displayWeekNumber();
                    break;
                case 6:
                    checkWeekend();
                    break;
                case 7:
                    displayDayOfYear();
                    break;
                case 8:
                    displayDayDetails();
                    break;
                case 9:
                    System.out.println("Exiting Time Explorer. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            pressEnterToContinue();
        }
    }

    private static void displayMenu() {
        System.out.println("\n=== Time Explorer Menu ===");
        System.out.println("1. Current Date and Time");
        System.out.println("2. Current Date");
        System.out.println("3. Current Year");
        System.out.println("4. Current Month");
        System.out.println("5. Week Number");
        System.out.println("6. Weekend Check");
        System.out.println("7. Day of Year");
        System.out.println("8. Day Details");
        System.out.println("9. Exit");
        System.out.print("Enter your choice: ");
    }

    private static int getUserChoice() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // consume invalid input
        }
        return scanner.nextInt();
    }

    private static void displayCurrentDateTime() {
        System.out.println("🕒 Current Date and Time: " +
                now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

    private static void displayCurrentDate() {
        System.out.println("📅 Today's Date: " + today);
    }

    private static void displayCurrentYear() {
        System.out.println("🗓️ Current Year: " + today.getYear());
    }

    private static void displayCurrentMonth() {
        System.out.println("🌙 Current Month: " + today.getMonth());
    }

    private static void displayWeekNumber() {
        int weekNumber = today.getDayOfYear() / 7 + 1;
        System.out.println("📊 Week Number: " + weekNumber + "/52");
    }

    private static void checkWeekend() {
        boolean isWeekend = today.getDayOfWeek().getValue() >= 6;
        System.out.println("🎲 Weekend Status: " +
                (isWeekend ? "It's a Weekend! 🎉" : "Workday 💼"));
    }

    private static void displayDayOfYear() {
        System.out.println("🌈 Day of Year: " + today.getDayOfYear() + "/365");
    }

    private static void displayDayDetails() {
        System.out.println("📆 Day of Month: " + today.getDayOfMonth());
        System.out.println("🗓️ Day of Week: " + today.getDayOfWeek());
    }

    private static void pressEnterToContinue() {
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
        scanner.nextLine();
    }
}