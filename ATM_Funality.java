package com.ATMinterface;

import java.util.Scanner;

public class ATM_Funality {
    
    float balance = 0;
    int pin = 1234;
    
    public void pin() {
        System.out.println("Enter your pin:");
        Scanner sc = new Scanner(System.in);
        int enterpin = sc.nextInt();
        
        if (enterpin == pin) {
            System.out.println("Welcome");
            menu();
        } else {
            System.out.println("You entered the wrong pin..");
            pin();
        }
    }
    
    private void menu() {
        System.out.println("Choose the correct option:");
        System.out.println("Press 1 :: Check Account Balance");
        System.out.println("Press 2 :: Deposit");
        System.out.println("Press 3 :: Withdraw");
        System.out.println("Press 4 :: Exit");
        
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        
        switch(option) {
            case 1:
                checkAccountBalance();
                menu();
                break;
            case 2:
                deposit();
                menu();
                break;
            case 3:
                withdraw();
                menu();
                break;
            case 4:
                exit();
                break;
            default:
                System.out.println("Choose the correct option");
                menu();
        }
    }
    
    private void exit() {
        System.out.println("Are you sure you want to exit? (y/n)");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        if (str.equalsIgnoreCase("y")) {
            System.out.println("Thank you for visiting...");
        } else {
            menu();
        }
    }

    private void withdraw() {
        System.out.println("Enter the amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        float withdraw = sc.nextFloat();
        
        if (withdraw > balance) {
            System.out.println("You do not have sufficient funds.");
        } else {
            balance -= withdraw;
            System.out.println("Withdrawal successful!");
        }
    }

    private void deposit() {
        System.out.println("Enter the amount to deposit:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance += amount;
        System.out.println("Deposit successful!");
    }

    private void checkAccountBalance() {
        System.out.println("Your current balance is: " + balance);
    }
    
    public static void main(String[] args) {
        ATM_Funality atm = new ATM_Funality();
        atm.pin();
    }
}
