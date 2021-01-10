package SuperMarket;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SuperMarket {

    HashMap <String, Integer> products = new HashMap<String, Integer>();

    public void setProducts(String producto, int precio) {
        this.products.put(producto, precio);
        System.out.println("You've added " + producto + " to your inventory");
    }

    public void getProducts() {

        Set sn = products.entrySet();
        Iterator it = sn.iterator();

        while (it.hasNext()) {
            Map.Entry mp = (Map.Entry) it.next();
            System.out.print(mp.getKey() + ": ");
            System.out.print( mp.getValue() + ", ");
        }
    }

    public void sellProduct(String producto) {
        this.products.remove(producto);
        System.out.println("You've sold " + producto);
    }

}
