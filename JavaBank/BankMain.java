
public class BankMain implements Account {

 public static void main(String[] args) {
  // Create Cust1
  Account Cust1 = new Account(); // Create an account object
  Cust1.deposit(1000);
  Cust1.Withdraw(200);
  
  // Create Cust2
  Account Cust2 = new Account(); // Create an account object
  Cust2.deposit(900.32);
  
  
  System.out.print("Cust1 has a balance of ");
  System.out.println(Cust1.getBalance());
  System.out.print("Cust2 has a balance of ");
  System.out.println(Cust2.getBalance());
 }

}
