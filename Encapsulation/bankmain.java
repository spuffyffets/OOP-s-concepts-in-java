package Encapsulation;

public class bankmain {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setAccountno(94568);
        bank.setBalance(1000.0);
        bank.withdraw(500.0);
        bank.deposit(200.0);
    }
}
