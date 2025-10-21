package com.chitkara.Day58;

class BankAccount{
    static int Accounts=0;
    private int accNum;
    private int balance;
    private String holder;
    
    BankAccount(int accNum,String owner, int balance){
        this.accNum=accNum;
        holder=owner;
        this.balance=balance;
        Accounts++;
    }
    void deposit(int a){
        balance+=a;
    }
    void withdraw(int a){
        balance-=a;
    }
    void display(){
        System.out.println("Account "+accNum+": "+holder+" Balance: $"+balance);
    }
}

public class BankManagement {
    public static void main(String[] args) {
        BankAccount a1= new BankAccount(1001,"John",1500);
        BankAccount a2= new BankAccount(1002,"Alice",2500);
        System.out.println("Total accounts: "+BankAccount.Accounts);
        a1.display();
        a2.display();
        a1.deposit(200);
        a2.withdraw(500);
        System.out.print("After Deposit ");
        a1.display();
        System.out.print("After withdraw ");
        a2.display();
    }
}
