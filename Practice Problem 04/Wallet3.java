//task 03
public class Wallet3 {

    private static int counter = 1000;

    private final int id;    
    private double balance;

    public Wallet3() {
        this.id = counter++;
        this.balance = 0;
    }

    public Wallet3(double balance) {
        this.id = counter++;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Wallet3 " + id + ": Insufficient balance!");
        } else {
            this.balance -= amount;
        }
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {

        Wallet3 w1 = new Wallet3();

        Wallet3 w2 = new Wallet3(500);
        Wallet3 w3 = new Wallet3(1000);

        w1.deposit(200);
        w2.withdraw(100);
        w3.deposit(300);
        w3.withdraw(500);

        System.out.println("Wallet3 ID: " + w1.getId() + ", Balance: " + w1.getBalance());
        System.out.println("Wallet3 ID: " + w2.getId() + ", Balance: " + w2.getBalance());
        System.out.println("Wallet3 ID: " + w3.getId() + ", Balance: " + w3.getBalance());
    }
}