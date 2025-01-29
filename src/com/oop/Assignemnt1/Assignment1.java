package com.oop.Assignemnt1;

import java.util.ArrayList;

public class Assignment1 {
  public static ArrayList<Assignment1> ac=new ArrayList<Assignment1>();

int id;
String owenerName;
String accountType;
private double balance;

public Assignment1(int id,String owenerName,String accountType,double balance){
    this.id=id;
    this.owenerName=owenerName;
    this.accountType=accountType;
    this.balance=balance;
    ac.add(this);
}
public static Assignment1 getAccountName(String name){
    for (Assignment1 a:ac){
        if(a.owenerName.equals(name)){
            return a;
        }
    }
    return null;
}
public void getAccountDetails(){
    System.out.println("Owner:"+this.owenerName);
    System.out.println("Type:"+this.accountType);
    System.out.println("Balance"+this.balance);

}
public void withdraw(double amount){
    if(balance<=amount){
        System.out.println("Insufficiant balance");
        return;
    }
    else{
        this.balance-=balance;
    }

}

    public double getBalance() {
        return balance;
    }

    public void deposite(double amount)
    {
        this.balance+=amount;
    }
    public void delete(){
    int val=this.id;
    ac.remove(id);
    }

    public void interest(int i) {
    double amount=this.balance;
    double interestOnAmount=(amount*10*i)/100;
    System.out.println("The interest you'll need to pay after year is :"+interestOnAmount);
    }
}
