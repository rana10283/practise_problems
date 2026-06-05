//Task 02
public class Wallet {

    private double balance;

    public Wallet(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient balance!");
        } else {
            this.balance = this.balance - amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {

        Wallet wallet1 = new Wallet(1000);
        Wallet wallet2 = new Wallet(500);

        wallet1.deposit(300);
        wallet1.withdraw(200);

        wallet2.deposit(100);
        wallet2.withdraw(50);

        System.out.println("Final balance of Wallet 1: " + wallet1.getBalance());
        System.out.println("Final balance of Wallet 2: " + wallet2.getBalance());
    }
}