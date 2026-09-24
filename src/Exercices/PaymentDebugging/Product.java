package Exercices.PaymentDebugging;

public class Product {

    private final String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void removeStock(int quantity) {
        stock -= quantity;
    }
}