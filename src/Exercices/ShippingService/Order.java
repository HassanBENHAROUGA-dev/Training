package Exercices.ShippingService;

public class Order {

    private double weight;

    private ShippingType shippingType;

    public Order(double weight, ShippingType shippingType) {
        this.weight = weight;
        this.shippingType = shippingType;
    }

    public ShippingType getShippingType() {
        return shippingType;
    }

    public double getWeight() {
        return weight;
    }
}