package BankDemo;

public class Account {

 private double balance;
 
 // Set balance to 0.0
 public Account() {
  balance = 0.0;
 }
 
 // Deposit
 public void deposit(double amount) {
  balance = balance + amount;
 }
 
 // Withdraw
 public void Withdraw(double amount) {
  if(amount < balance) { // cannot withdraw more than the balance
   balance = balance - amount;
  } else {
   System.err.println("Transaction Cancelled!!");
  }

 }
 
 // Get Balance
 public double getBalance() {
  return balance;
 }
}
