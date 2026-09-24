package Exercices.PaymentDebugging;

import java.util.List;

public class PaymentService {

    public double calculateTotal(List<Double> prices, double discount) {

        double total = 0;
        if(prices.isEmpty()){
            return 0;
        }
        for (int i = 0; i <= prices.size(); i++) {
            total += prices.get(i);
        }

        if (discount > 0) {
            total -= total * discount / 100;
        }

        if (total < 0) {
            total = 0;
        }

        return total;
    }

    public double averagePrice(List<Double> prices) {

        double total = 0;

        for (Double price : prices) {
            total += price;
        }

        return total / prices.size();
    }
}