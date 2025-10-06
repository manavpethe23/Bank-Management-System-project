package com.braindata.bankmanagement.serviceImpl;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;

import java.util.Scanner;

public class Sbi implements Rbi {

    Scanner sc = new Scanner(System.in);
    Account ac = new Account();

    @Override
    public void createAccount() {
        System.out.println("Enter Your Account Number");
        ac.setAccNo(sc.nextInt());

        System.out.println("Enter Your Name: ");
        ac.setName(sc.next());

        System.out.println("Enter Your Mobile Number: ");
        ac.setMobNo(sc.next());

        System.out.println("Enter Your AdharNO.: ");
        ac.setAdharNo(sc.next());

        System.out.println("Enter your Gender: ");
        ac.setGender(sc.next());

        System.out.println("Enter Your Age: ");
        ac.setAge(sc.nextInt());

        System.out.println("Enter Your Balance: ");
        ac.setBalance(sc.nextDouble());

        System.out.println("Your Account Created Sucessfully....!");
    }

    @Override
    public void displayAllDetails() {
    	System.out.println("--------------------------------------------------");
        System.out.println("Welcome To State Bank Of India.");

        System.out.println("Your Account Number: " + ac.getAccNo());
        System.out.println("Your Name: " + ac.getName());
        System.out.println("Your Mobile Number: " + ac.getMobNo());
        System.out.println("Your Adhar Number: " + ac.getAdharNo());
        System.out.println("Your Gender: " + ac.getGender());
        System.out.println("Your Age : " + ac.getAge());
        System.out.println("Your Balance: " + ac.getBalance());

        System.out.println("------------------------------------------------");
    }

    @Override
    public void depositeMoney() {
    	
    	System.out.println("--------------------------------------------------");
    	
        while (true) {
            System.out.println("Enter Your Account Number: ");
            int AccNo = sc.nextInt();

            if (ac.getAccNo() == AccNo) {
                System.out.println("Enter Amount You Want to Deposite....!");
                double amt = sc.nextDouble();

                ac.setBalance(ac.getBalance() + amt);

                System.out.println("Deposite Successful..... \nYour Total Balance : " + ac.getBalance());
                
                System.out.println("--------------------------------------------------");
                return;
            } else {
            	System.out.println("--------------------------------------------------");
            	
                System.out.println("Oopppp....!");
                System.out.println("Enter Valid Account Number");
                System.out.println("--------------------------------------------------");
            }
        }
    }

    @Override
    public void withdrawal() {
    	
        while (true) {
        	System.out.println("--------------------------------------------------");
        	
            System.out.println("Enter Your Account Number: ");
            int AccNo = sc.nextInt();

            if (ac.getAccNo() == AccNo) {
                System.out.println("Enter Amount You Want to Withdrwal....!");
                double amt = sc.nextDouble();

                if (ac.getBalance() >= amt) {
                    ac.setBalance(ac.getBalance() - amt);
                    System.out.println("Withdraw Successful...! \nYour Total Balance : " + ac.getBalance());
                } else {
                    System.out.println("Insufficient Balence...!");
                }
                
                System.out.println("--------------------------------------------------");
                return;
            } else {
            	System.out.println("--------------------------------------------------");
            	
                System.out.println("Oopppp....!");
                System.out.println("Enter Valid Account Number");
                
                System.out.println("--------------------------------------------------");
            }
        }
    }

    @Override
    public void balanceCheck() {
        while (true) {
        	System.out.println("--------------------------------------------------");
        	
            System.out.println("Enter Your Account Number: ");
            int AccNo = sc.nextInt();

            if (ac.getAccNo() == AccNo) {
                System.out.println("Your Total Balance is: " + ac.getBalance());
                System.out.println("--------------------------------------------------");
                return;
                
            } else {
            	System.out.println("--------------------------------------------------");
            	
                System.out.println("Enter Valid Account Number.");
                
                System.out.println("--------------------------------------------------");
            }
        }
    }
}
