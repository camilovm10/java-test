package TesteosUdemy;

public class isOdd {


    public static int isOddPapa(int start, int end) {
        int count = 0;

        if(start >= 0 && end > start) {
            for (int i = start; i <= end; i++) {

                if (!(i % 2 == 0)) {
                    System.out.println(i + " it's an odd number");
                    count += i;
                }

            }

        } else {
            System.out.println("Invalid parameters");
            return -1;
        }

        return count;

    }


    public static void main(String[] args) {

        System.out.println("The sum of odd numbers in that range is " + isOddPapa(-1,5));



    }



}
