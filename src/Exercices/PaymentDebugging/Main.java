package Exercices.PaymentDebugging;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        OrderService orderService = new OrderService();
        Product laptop = new Product("Laptop", 5);
        Product mouse = new Product("Mouse", 10);
        Order order = new Order(List.of(
                new OrderLine(laptop, 3),
                new OrderLine(mouse, 12)
        ));
        System.out.println(orderService.processOrder(order));
    }
}
