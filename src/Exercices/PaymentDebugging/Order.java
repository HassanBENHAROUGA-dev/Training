package Exercices.PaymentDebugging;

import java.util.List;

public class Order {

    private final List<OrderLine> lines;
    private OrderStatus status = OrderStatus.CREATED;

    public Order(List<OrderLine> lines) {
        this.lines = lines;
    }

    public List<OrderLine> getLines() {
        return lines;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}