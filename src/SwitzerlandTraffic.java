import demoTestPack2.Dog;

public class SwitzerlandTraffic implements CentralTraffic {


    @Override
    public void greenGo() {
        System.out.println("Ready to go !!!");
    }

    @Override
    public void redStop() {
        System.out.println("Stop that machine buddy !");
    }

    @Override
    public void flashYellow() {
        System.out.println("Get ready...");
    }

    public static void main(String[] args) {

        SwitzerlandTraffic switzObject = new SwitzerlandTraffic();

        switzObject.greenGo();

        Dog venus = new Dog();

    }
}
