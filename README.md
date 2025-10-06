# 🏦 Bank Management System (Java)

![Java](https://img.shields.io/badge/Java-17-orange?logo=java&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Concepts-blue)
![License: MIT](https://img.shields.io/badge/License-MIT-green)
![Status](https://img.shields.io/badge/Status-Active-success)

A simple **console-based Bank Management System** built in **Java**.  
This project demonstrates **Object-Oriented Programming concepts**, **interface implementation**, and **menu-driven programming**.

---

## 📌 Features
- Create a new bank account  
- Display account details  
- Deposit money  
- Withdraw money (with balance check)  
- Check account balance  
- Menu-driven interface  

---

## 🗂️ Project Structure
classDiagram

    class Rbi {
        <<interface>>
        +createAccount()
        +displayAllDetails()
        +depositeMoney()
        +withdrawal()
        +balanceCheck()
    }
    
    class Sbi {
        -Scanner sc
        -Account ac
        +createAccount()
        +displayAllDetails()
        +depositeMoney()
        +withdrawal()
        +balanceCheck()
    }
    
    class Account {
        -int accNo
        -String name
        -double balance
        +getters/setters
    }
    
    class Test {
        +main(String[] args)
    }
    
    Rbi <|.. Sbi
    Sbi --> Account
    Test --> Rbi
