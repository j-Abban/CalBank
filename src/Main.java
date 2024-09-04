
public class Main {
    public static void main(String[] args) {
        // create Savings account with initial balance of 4200
        SavingsAccount savings = new SavingsAccount(4200);

        // check balance using the check balance method
        savings.checkBalance();

        // Withdrawing
        savings.withdraw(200);

        // Check balance again
        savings.checkBalance();

        // Deposit
        savings.deposit(800);

        // Check balance again
        savings.checkBalance();

        // Print the string representation of the SavingsAccount object
        System.out.println(savings);
    }
}