package Exercices.OrderRefactoring;

public abstract class Product {

    private String name;
    private ProductType type;
    private double price;

    public String getName() {
        return name;
    }

    public ProductType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculatePrice();
// getters
}