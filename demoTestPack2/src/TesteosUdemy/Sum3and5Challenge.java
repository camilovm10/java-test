package TesteosUdemy;

public class Sum3and5Challenge {

    public static void main(String[] args) {


        int count = 0;
        int countToFinish = 0;

        for (int i = 1; i <= 1000; i++) {

            if( i % 3 == 0 && i % 5 == 0 ) {
                count += i;
                System.out.println("The number was " + i);
                countToFinish += 1;
            }
            if (countToFinish == 5) {
                System.out.println("Game over !");
                System.out.println("The sum of all winner numbers was " + count);
                break;
            }

        }



    }
}
