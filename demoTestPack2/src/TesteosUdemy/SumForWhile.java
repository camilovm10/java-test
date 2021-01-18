package TesteosUdemy;

public class SumForWhile {

    public static int sumDigits(int num) {

        int count = 0;
        int leastSignificantNumber = 0;
        int mostSignificantNumber = 0;

        if(num >= 10) {

            if(num < 100) {
                leastSignificantNumber = num % 10;
                mostSignificantNumber = (num - leastSignificantNumber) / 10;
                return leastSignificantNumber + mostSignificantNumber;
            } else {

                leastSignificantNumber = num % 10;
                count += leastSignificantNumber;
                mostSignificantNumber = (num - leastSignificantNumber) / 10;
                while(mostSignificantNumber >= 10) {
                    leastSignificantNumber = mostSignificantNumber % 10;
                    count += leastSignificantNumber;
                    mostSignificantNumber = (mostSignificantNumber - leastSignificantNumber) / 10;
                }
                count += mostSignificantNumber;
                return count;

            }

        } else {
            System.out.println("Invalid parameters");
            return -1;
        }

    }

    public static void main(String[] args) {

        System.out.println(sumDigits(5));

    }
}
