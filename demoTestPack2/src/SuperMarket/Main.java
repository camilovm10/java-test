package SuperMarket;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        SuperMarket market = new SuperMarket();



        market.setProducts("milk", 10);
        market.setProducts("cereal", 7);
        market.setProducts("candy", 5);
        market.setProducts("milk", 10);

        market.getProducts();

        System.out.println(market.products);

    }
}
