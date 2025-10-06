package com.braindata.bankmanagement.client;

import java.util.*;
import com.braindata.bankmanagement.service.Rbi;
import com.braindata.bankmanagement.serviceImpl.Sbi;

public class Test {

    public static void main(String[] args) {
        Rbi bank = new Sbi();
        Scanner sc = new Scanner(System.in);

        while (true) {
        	System.out.println("--------------------------------------------------");
            System.out.println("Enter Your Choice");
            System.out.println("Enter 1 For Creating Account.");
            System.out.println("Enter 2 For Display Your Account Details.");
            System.out.println("Enter 3 For Deposit Money.");
            System.out.println("Enter 4 For Withdraw Money.");
            System.out.println("Enter 5 For Check Your Balance.");
            System.out.println("Enter 6 To Close Program.");
            System.out.println("--------------------------------------------------");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    bank.createAccount();
                    break;
                case 2:
                    bank.displayAllDetails();
                    break;
                case 3:
                    bank.depositeMoney();
                    break;
                case 4:
                    bank.withdrawal();
                    break;
                case 5:
                    bank.balanceCheck();
                    break;
                case 6:
                    System.out.println("Thank you for banking with SBI!");
                    return;
                default:
                    System.out.println("Please enter a Valid Choice");
            }
        }
    }
}
