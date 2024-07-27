package Encapsulation;

public class Bank {
    private int acc_no;
private double balance;

  public int getAccountno() {
	  return acc_no ;
  }
  public void  setAccountno(int acc_no){
	  this.acc_no=acc_no;
  }
  public double getBalance() {
	  return balance ;
  }
  public void  setBalance(double balance){
	  this.balance=balance;
  }
  public void withdraw (double amount) {
	  if(amount <= balance) {
		  balance-=amount;
		  System.out.println("withdraw sucessful.new balance ="+ balance);
	  }else {System.out.println("insufficient balance");
	  }
	  
	  
  }
  public void deposit(double amount) {
	  balance +=amount;
	  System.out.println("deposit sucessful.new balance "+balance);
  }
  
}
