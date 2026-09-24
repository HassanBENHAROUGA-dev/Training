package Exercices.ShippingService;

import java.util.Map;

public class ShippingService {

    private final Map<ShippingType, ShippingStrategy> orderStrategy;

    public ShippingService(Map<ShippingType, ShippingStrategy> orderStrategy) {
        this.orderStrategy = orderStrategy;
    }

    public double calculateShipping(Order order) {
        ShippingStrategy strategy =
                orderStrategy.get(order.getShippingType());

        if (strategy == null) {
            throw new IllegalArgumentException(
                    "Unknown shipping type: " + order.getShippingType()
            );
        }

        return strategy.calculateShip(order);
    }

    private static Map<ShippingType, ShippingStrategy> initializeStrategies() {
        return Map.of(
                ShippingType.STANDARD, new StandardShipping(),
                ShippingType.EXPRESS, new ExpressShipping(),
                ShippingType.SAME_DAY, new SameDayShipping()
        );
    }
}