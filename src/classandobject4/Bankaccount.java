/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classandobject4;

/**
 *
 * @author NCC
 */
public class Bankaccount {
    private String accounHolderName, accountNumber;
    private double balance;

    public Bankaccount(String accounHolderName, String accountNumber, double balance) {
        this.accounHolderName = accounHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccounHolderName() {
        return accounHolderName;
    }

    public void setAccounHolderName(String accounHolderName) {
        this.accounHolderName = accounHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void withdraw(double amt){
        this.balance= this.balance-amt;
    }
    public void deposit(double amt){
    this.balance=this.balance+amt;
    }
    
}
