//Task 05
public class Wallet5 {

    private static int counter = 1000;

    private final int id;
    private double balance;

    public Wallet5(double balance) {
        this.id = counter++;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getId() {
        return this.id;
    }

    public static void addBonus(Wallet5 wallet, double amount) {
        wallet.balance += amount;
    }

    public static void swap(Wallet5 a, Wallet5 b) {
        Wallet5 temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {

        Wallet5 w1 = new Wallet5(1000);
        Wallet5 w2 = new Wallet5(500);

        addBonus(w1, 200);
        addBonus(w2, 100);

        swap(w1, w2);

        System.out.println("Wallet 1 ID: " + w1.getId() + ", Balance: " + w1.getBalance());
        System.out.println("Wallet 2 ID: " + w2.getId() + ", Balance: " + w2.getBalance());
    }
}