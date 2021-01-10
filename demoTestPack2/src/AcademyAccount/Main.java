package AcademyAccount;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SavingsAccount camiloAccount = new SavingsAccount(0.0, "Camilo");

        boolean question = true;

        while (question == true) {

            Scanner scan = new Scanner(System.in);
            System.out.println(camiloAccount.getHello());
            System.out.println("Tell us what you want to do. Deposit (1), withdraw (2), balance (3)");
            int depositOrWithdraw = scan.nextInt();

            if(depositOrWithdraw == 1) {
                System.out.println("Deposit amount : ");
                double deposit = scan.nextDouble();
                camiloAccount.getDeposit(deposit);
            } else if(depositOrWithdraw == 2) {
                System.out.println("Withdraw amount : ");
                double withdraw = scan.nextDouble();
                camiloAccount.getWithdraw(withdraw);
            } else if (depositOrWithdraw == 3) {
                camiloAccount.getBalance();
            }

            System.out.println("Do you want to do another operation ? ");


            question = scan.nextBoolean();
        }
    }
}
