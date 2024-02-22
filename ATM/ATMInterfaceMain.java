import java.util.Scanner;

public class ATMInterfaceMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter initial account balance:$");
        double initialbalance=scanner.nextDouble();
        BankAccount bankAccount=new BankAccount(initialbalance);

        AtmInterface atm=new AtmInterface(bankAccount);
        while(true){
            atm.displayALlMenu();
            System.out.println("select a aoption");
            int choice=scanner.nextInt();
            atm.Transaction(choice,scanner);
        }
    }

}
