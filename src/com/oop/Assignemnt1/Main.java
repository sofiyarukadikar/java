package com.oop.Assignemnt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Assignment1 a1;
        int bankid=1;
        String name,type;
        double balance;
        int choice1,choice2;
       do{
            System.out.println("*******************Sofiya's Bank********************");
            System.out.println("Hello! welcome to sofiya's bank.. what would you like to do?");
            System.out.println("1.Create an account\n" +
                    "2.Access account\n"+
                    "3.Display accounts\n"+
                    "4.exit"
            );
            System.out.println("*****************************************************");
            choice1=sc.nextInt();
            switch (choice1){
                case 1:
                    System.out.println("Creating an account:");
                    System.out.println("Please fill the details below:");
                    System.out.println("Type:\n 1. Savings 2. Checking");// Reads an integer
                    if(sc.nextInt()==1){
                        type="saving";
                    }
                    else{
                        type="checking";
                    }
                    sc.nextLine();  // Flush the newline character

                    System.out.println("Owner name:");
                    name = sc.nextLine();

                    System.out.println("Enter initial deposit");
                    balance=sc.nextDouble();
                    a1=new Assignment1(bankid++,name,type,balance);
                    if(a1!=null){
                        System.out.println("Account created successfully!");
                    }
                    break;
                case 2:
                    System.out.println("Enter the account name");
                    sc.nextLine();
                    name=sc.nextLine();
                    a1=Assignment1.getAccountName(name);
                    a1.getAccountDetails();
                    System.out.println("Select the task you'd like to perform----->");
                    System.out.println("1.withdraw\n"+"2.deposite\n"+"3.delete account\n"+"4.calculate interest\n"+"5.check balance\n"+"6.exit");
                    choice2=sc.nextInt();
                    while(choice2!=6){switch(choice2){
                        case 1:System.out.println("Enter amount to withdraw");
                            a1.withdraw(sc.nextDouble());
                            break;
                        case 2:
                            System.out.println("Enter amount to withdraw");
                            a1.deposite(sc.nextDouble());
                            break;
                        case 3:
                            a1.delete();
                            break;
                        case 4:
                            System.out.println("enter duration");
                            a1.interest(sc.nextInt());
                        case 5:
                            System.out.println("The current amount is:"+a1.getBalance());
                            break;
                    }}



            }
        }while(choice1!=4);

    }
}
