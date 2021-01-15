package SuperMarketFull;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Product> productsArray = new ArrayList<>();

        Product cookies = new Product("cookies", 15, 3);

        Product milk = new Product("milk", 7, 5);

        productsArray.add(cookies);
        productsArray.add(milk);



        String init = "yes";

        System.out.println(productsArray);

        while (init.equals("yes")) {

            System.out.println("WELCOME TO CAMILO'S SUPERMARKETS \n" +
                    "\n" +
                    "Add new product (1) \n" +
                    "Sell a product (2) \n" +
                    "See all the inventory (3) \n" +
                    "Edit a product (4) \n" +
                    "Re-stock a product (5)");

            int operation = scan.nextInt();

            switch(operation) {
                case 1:
                    System.out.println("What's the name of the new product?");
                    String nameNew = scan.next();
                    System.out.println("What's the price of the new product?");
                    int priceNew = scan.nextInt();
                    System.out.println("How many products you are adding");
                    int stockNew = scan.nextInt();

//                    Product newP = new Product(nameNew, priceNew, stockNew);
                    productsArray.add(new Product(nameNew, priceNew, stockNew));
                    break;
                case 2:
                    System.out.println("What's the name of the product you want to sell?");
                    String productToSell = scan.next();
                    System.out.println("How many products are you selling?");
                    int quantityOfProducts = scan.nextInt();

                    int indexToSell;
                    int j = 0;
                    String nameOfSoldProduct;

                    for (Product product : productsArray ) {
                        if (productToSell.equals(product.getName())) {

                            nameOfSoldProduct = product.getName();
                            indexToSell = j;

                            if(quantityOfProducts < product.getStock()) {
                                product.sellAProduct(quantityOfProducts);
                                System.out.println("You've sold " + quantityOfProducts + " units of " + nameOfSoldProduct + ".");
                            } else if(quantityOfProducts == product.getStock()) {
                                productsArray.remove(indexToSell);
                                System.out.println("You've sold all the stock of " + nameOfSoldProduct + ".");
                            } else {
                                System.out.println("Theres no enough stock of that product.");
                            }
                            break;
                        }
                        j++;
                    }
                    break;
                case 3:
                    for (Product element : productsArray ) {
                        System.out.print("Name : " + element.getName() + ",  ");
                        System.out.print("Price : " + element.getPrecio() + ",  ");
                        System.out.print("Stock : " + element.getStock() + "");
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.println("EDIT MENU \n" +
                            "\n" +
                            "Change the name of a product (1) \n" +
                            "Change the price of a product (2) \n");
                    int editMenuOperation = scan.nextInt();

                    switch (editMenuOperation) {
                        case 1:

                            System.out.println("What's the name of the product you want to rename?");
                            String productToEdit = scan.next();
                            System.out.println("Write the new name :");
                            String newNameOfProduct = scan.next();

                            for (Product product : productsArray ) {
                                if (productToEdit.equals(product.getName())) {
                                    product.setName(newNameOfProduct);
                                    System.out.println("The name of " + productToEdit + " have been changed to " + newNameOfProduct);
                                }
                            }

                            break;
                        case 2:

                            System.out.println("What's the name of the product you want to change the price?");
                            String productToChangePrice = scan.next();
                            System.out.println("Write the new price :");
                            int newPriceOfProduct = scan.nextInt();

                            for (Product product : productsArray ) {
                                if (productToChangePrice.equals(product.getName())) {
                                    product.setPrecio(newPriceOfProduct);
                                    System.out.println("The price of " + productToChangePrice + " have been changed to " + newPriceOfProduct);
                                }
                            }

                            break;
                        default:
                            System.out.println("That´s an incorrect option.");
                            break;
                    }

                    break;
                case 5:

                    System.out.println("What's the name of the product you want to re-stock?");
                    String productToRestock = scan.next();
                    System.out.println("How many products will you add?");
                    int quantityOfStock = scan.nextInt();

                    for (Product product : productsArray ) {
                        if (productToRestock.equals(product.getName())) {
                            product.reStock(quantityOfStock);
                            System.out.println("The new total of " + productToRestock + " is " + product.getStock());
                        }
                    }

                    break;
                default:
                    System.out.println("That´s an incorrect option.");
                    break;
            }

            System.out.println("\n" +
                    "Do you want to do another operation ? \n" +
                    "yes (1), no (2)" );
            int yesOrNo = scan.nextInt();

            if (yesOrNo == 1) {
                init = "yes";
            } else {
                init = "no";
            }
        }
    }
}
