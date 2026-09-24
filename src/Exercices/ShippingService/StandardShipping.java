package Exercices.ShippingService;

public class StandardShipping implements ShippingStrategy {

    @Override
    public double calculateShip(Order order) {
        return order.getWeight() * 1.5;
    }
}
