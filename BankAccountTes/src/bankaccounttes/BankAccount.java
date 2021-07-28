/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccounttes;

/**
 *
 * @author A.Safarji
 */
public class BankAccount {
    
        private String  AccountHolder;
        private int  AccountNumber;
        private double balance;

    public BankAccount(String AccountHolder, int AccountNumber, double balance) {
        this.AccountHolder = AccountHolder;
        this.AccountNumber = AccountNumber;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return AccountHolder;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String AccountHolder) {
        this.AccountHolder = AccountHolder;
    }

    public void setAccountNumber(int AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depots (double  amount ){
       this.balance+= amount;
      // this.balance= balance + amount;
       
}
     public void withdraw(double amount ){
          this.balance-=amount;
         // this.balance= balance - amount;
          
}

    public String toString() {
        return "BankTest{" + "AccountHolder=" + AccountHolder + ", AccountNumber=" + AccountNumber + ", balance=" + balance + '}';
    }

    
    
}
