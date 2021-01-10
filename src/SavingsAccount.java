public class SavingsAccount extends Account {

    int a = 20;


    static int balance = 0;

    public void AddBalance(int amount) {
        balance += amount;
    }

    public void WithDrawBalance(int amount) {
        balance -= amount;
    }

    public void GetBalance() {
        System.out.println(balance);
    }


    public static void main(String[] args) {

        SavingsAccount camiloAccount = new SavingsAccount();
        BankData bankInfo = new BankData();

        camiloAccount.AddBalance(1000);

        camiloAccount.AddBalance(5000);

        camiloAccount.WithDrawBalance(1500);

        camiloAccount.GetBalance();

        camiloAccount.WithDrawBalance(800);

        camiloAccount.GetBalance();

        bankInfo.GetWelcome("Camilo");

        camiloAccount.AskNewCard();

        camiloAccount.getCards();

        System.out.println(camiloAccount.swiftCode);


    }
}
