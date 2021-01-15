package Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Ingredient> ingredientInventory = new ArrayList<>();

        ingredientInventory.add(new Ingredient("orange", 5));


        String init = "yes";
        while (init.equals("yes")) {

            System.out.println();
             int operation = scanner.nextInt();


            switch (operation) {
                case 1:
                    System.out.println("What is the name of the ingredient?");
                    String nameOfIngredient = scanner.next();
                    System.out.println("How many items of the ingredient are you adding?");
                    int stockOfIngredient = scanner.nextInt();

                    ingredientInventory.add(new Ingredient("orange", 5));

                    break;
                default:
                    break;
            }


            System.out.println("Do you want to do another operation?");
            init = scanner.next();

        }


    }
}
