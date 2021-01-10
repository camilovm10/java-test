public class ConstructorDemo {

    int balance;
    String tipoCuenta, name;


    public ConstructorDemo(int bal, String typeAcc, String nameArg) {

        balance = bal;
        tipoCuenta = typeAcc;
        name = nameArg;

    }

    public void getBalance() {
        System.out.println(balance);
    }


    public static void main(String[] args) {

        ConstructorDemo cuenta = new ConstructorDemo(1500, "Savings", "Camilo");

        cuenta.getBalance();



    }
}
