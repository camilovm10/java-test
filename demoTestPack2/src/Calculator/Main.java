package Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        boolean key = true;

        while(key) {

            System.out.println("What operation you want to do? ");
            System.out.println("Addition (1), Substraction (2), Multiplication (3), Divition (4)");
            int operation = scan.nextInt();
            System.out.println("Give me the first number");
            int val1 = scan.nextInt();
            System.out.println("Give me the second number");
            int val2 = scan.nextInt();

            switch(operation) {
                case 1:
                    System.out.println("The result of your sum is : " + calc.add(val1, val2));
                    break;
                case 2:
                    System.out.println("The result of your substraction is : " + calc.substract(val1, val2));
                    break;
                case 3:
                    System.out.println("The result of your multiplication is : " + calc.multiply(val1, val2));
                    break;
                case 4:
                    System.out.println("The result of your divition is : " + calc.divide(val1, val2));
                    break;
                default:
            }

            System.out.println("Do you want to do another operation ?");
            key = scan.nextBoolean();

        }



    }

}
