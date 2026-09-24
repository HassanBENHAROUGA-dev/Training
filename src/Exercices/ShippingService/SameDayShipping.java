package Exercices.ShippingService;

public class SameDayShipping implements ShippingStrategy {
    @Override
    public double calculateShip(Order order) {
        return order.getWeight() * 5.0 + 15;
    }
}
