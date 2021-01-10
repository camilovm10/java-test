package AcademyAccount;

public class SavingsAccount {

    public double balance;
    public String name;



    public SavingsAccount(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public String getHello() {
        String hello = ("Hi, " + this.name + ", welcome to our bank. Right now you have " + this.balance + " in your balance");
        return hello;
    }

    public void getBalance() {
        System.out.println("Your balance is : " + this.balance);
    }


    public void getDeposit(double deposit) {
        this.balance += deposit;
        System.out.println( "Your new account mount is : " + this.balance);
    }

    public void getWithdraw(double withdraw) {

        if (this.balance > withdraw) {
            this.balance -= withdraw;
            System.out.println( "Your new account mount is : " + this.balance);
        } else {
            System.out.println("Not enough money in your account");
        }
    }

}
