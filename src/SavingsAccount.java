public class SavingsAccount {
    int balance;
    String name = "Justice Abban";

    // SavingsAccount constructor method
    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }
// Method to check balance
    public void checkBalance(){
        System.out.println("Hello " + name);
        System.out.println("Your balance is " + balance);
    }
// Method to deposit money to Account
    public void deposit(int amountToDeposit){
    balance = balance + amountToDeposit;
    System.out.println("You just deposited " + amountToDeposit);
    }
// Method to Withdraw money from the Savings Account
    public int withdraw(int amountToWithdraw){
        balance = balance - amountToWithdraw;
        System.out.println("You just withdrew " + amountToWithdraw);
        return amountToWithdraw;
    }

}
