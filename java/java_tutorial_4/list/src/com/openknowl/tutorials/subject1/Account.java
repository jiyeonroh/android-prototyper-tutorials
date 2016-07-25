package com.openknowl.tutorials.subject1;

public class Account {
    private String accountNumber;
    private String owner;
    private int balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Account() {
    }

    public Account(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "계좌번호 = " + this.accountNumber + " 계좌주 = " + this.owner + " 잔액 = " + this.balance;
    }
}
