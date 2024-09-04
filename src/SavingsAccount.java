public class SavingsAccount {
    int balance;
    String name = "Justice";

    // SavingsAccount constructor method
    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }
// Method to check balance
    public void checkBalance(){
        System.out.println("Hello " + name);
        System.out.println("Your balance is " + balance + ".");
        System.out.println("Thank you for banking with us.");
    }
// Method to deposit money to Account
    public void deposit(int amountToDeposit){
    balance = balance + amountToDeposit;
    System.out.println("You just deposited " + amountToDeposit);
    }
// Method to return the amountToWithdraw
    public void withdraw(int amountToWithdraw){
        if (amountToWithdraw > balance) {
            System.out.println("Insufficient funds! You cannot withdraw");
        } else {
            balance = balance - amountToWithdraw;
            System.out.println("You just withdrew " + amountToWithdraw);
        }
    }

// Method to return a string
   public String toString(){
        return "This is a savings account with " + balance + " saved.";
   }
}