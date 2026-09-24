package Exercices.OrderRefactoring;

import Exercices.GildedRosesKata.Class.ItemType;

import java.util.Map;

public class OrderService {

    //private final Map<ProductType, ProductsService> strategyMap;

    public double calculatePrice(Order order) {
        double price = 0;

        for (Product product : order.getProducts()) {
            price += product.calculatePrice();
        }

        price = order.getCustomer()
                .getType()
                .applyDiscount(price);

        if (price > 1000) {
            price *= 0.97;
        }

        return price;
    }
}
