import java.util.Scanner;

public class AtmInterface{

    private BankAccount bankAccount;
    public AtmInterface( BankAccount bankAccount){
        this.bankAccount=bankAccount;


    }
    public void displayALlMenu(){
        System.out.println("ATM MENU");
        System.out.println("1. Cheak Balance");
        System.out.println("2. Deposit");
        System.out.println("3. withdraw");
        System.out.println("4. Exit");

    }
    public void Transaction(int choice, Scanner scanner){
        switch (choice){
            case 1:
                System.out.println("current balance:$"+bankAccount.GetBalance());
                break;
            case 2:
                System.out.println("Enter deposite amount :$");

                double depositeAmount=scanner.nextDouble();
                bankAccount.deposit(depositeAmount);
                break;
            case 3:
                System.out.println("Entre withdraw amount:$");
                double withdrawAmount=scanner.nextDouble();
                bankAccount.withdraw(withdrawAmount);
                break;
            case 4:
                System.out.println("EXIT ATM.THANK You");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("INVALID CHOICE ::PLEASE SELECT VALID OPTION");
        }
    }
}
