package Exercices.OrderRefactoring;

public class Electronic extends  Product {
    @Override
    public double calculatePrice() {
        double price = getPrice();

        if (price > 500) {
            price += 20;
        }

        return price;
    }
}
