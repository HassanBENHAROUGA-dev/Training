package Exercices.PaymentDebugging;

public class OrderService {

    public boolean processOrder(Order order) {

        for (OrderLine line : order.getLines()) {
            Product product = line.getProduct();
            int quantity = line.getQuantity();

            if (product.getStock() < quantity) {
                order.setStatus(OrderStatus.REJECTED);
                return false;
            }
        }

        for (OrderLine line : order.getLines()) {
            Product product = line.getProduct();
            int quantity = line.getQuantity();

            product.removeStock(quantity);
        }

        order.setStatus(OrderStatus.CONFIRMED);
        return true;
    }
}