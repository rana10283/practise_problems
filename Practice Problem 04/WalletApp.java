//Task 01
public class WalletApp {

    public static double deposit(double balance, double amount) {
        return balance + amount;
    }

    public static double withdraw(double balance, double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
            return balance;
        }
        return balance - amount;
    }

    public static void main(String[] args) {

        double balance_1 = 1000;
        double balance_2 = 500;

        balance_1 = deposit(balance_1, 300);
        balance_1 = withdraw(balance_1, 200);

        balance_2 = deposit(balance_2, 100);
        balance_2 = withdraw(balance_2, 50);

        System.out.println("Final balance of Wallet 1: " + balance_1);
        System.out.println("Final balance of Wallet 2: " + balance_2);
    }
}