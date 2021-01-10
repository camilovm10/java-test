package SuperMarketFull;

public class Product {

    private String name;
    private double precio;
    private int stock;

    public Product(String name, double precio, int stock) {
        this.name = name;
        this.precio = precio;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void reStock(int stock) {
        this.stock += stock;
    }

    public void sellAProduct(int quantity) {
        stock -= quantity;
    }
}
