public class BankAccount {
    private double balance;

    public BankAccount(double startingbalance) {
        this.balance = startingbalance;
    }

    public double GetBalance() {
        return balance;

    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = amount;
            System.out.println("Deposite of " + amount + "success.current balaance is" + balance);

        } else {
            System.out.println("INVALID DEPOSIT AMOUNT:");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw of $" + amount + "successs .current balance :" + balance);

        } else {
            System.out.println("INVALID Withdraw amount or Insufficent balance");
        }
    }

}
