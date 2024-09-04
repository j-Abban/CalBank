
public class Main {
    public static void main(String[] args) {
        // create Savings account with initial balance of 4200
        SavingsAccount savings = new SavingsAccount(4200);

        // check balance
        savings.checkBalance();

        // Withdrawing
        savings.withdraw(200);

        // Check balance
        savings.checkBalance();

        // Deposit to my account
        savings.deposit(800);

        // Check balance
        savings.checkBalance();
    }
}