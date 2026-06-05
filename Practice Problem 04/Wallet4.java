// task 04
public class Wallet4 {

    private static int counter = 1000;

    private final int id;
    private double balance;

    private String lastWithdrawMode = "NONE";

    public Wallet4() {
        this.id = counter++;
        this.balance = 0;
    }

    public Wallet4(double balance) {
        this.id = counter++;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Wallet4 " + id + ": Insufficient balance!");
        } else {
            this.balance -= amount;
            this.lastWithdrawMode = "NORMAL";
        }
    }

    public void withdraw(double amount, String mode) {
        if (amount > this.balance) {
            System.out.println("Wallet4 " + id + ": Insufficient balance!");
        } else {
            this.balance -= amount;
            this.lastWithdrawMode = mode;
        }
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getLastWithdrawMode() {
        return this.lastWithdrawMode;
    }

    public static void main(String[] args) {

        Wallet4 w1 = new Wallet4(1000);
        Wallet4 w2 = new Wallet4(500);

        w1.withdraw(200);

        w2.withdraw(100, "ATM");

        w1.withdraw(300, "ONLINE");

        System.out.println("Wallet4 ID: " + w1.getId() +
                ", Balance: " + w1.getBalance() +
                ", Last Withdraw Mode: " + w1.getLastWithdrawMode());

        System.out.println("Wallet4 ID: " + w2.getId() +
                ", Balance: " + w2.getBalance() +
                ", Last Withdraw Mode: " + w2.getLastWithdrawMode());
    }
}