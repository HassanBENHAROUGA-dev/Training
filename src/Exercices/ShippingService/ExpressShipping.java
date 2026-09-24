package Exercices.ShippingService;

public class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculateShip(Order order) {
        return order.getWeight() * 3.0 + 5;
    }
}
