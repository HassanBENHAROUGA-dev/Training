package Exercices.OrderRefactoring;

import java.util.List;

public class Order {

    private Customer customer;
    private List<Product> products;
    public List<Product> getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }
// getters
}