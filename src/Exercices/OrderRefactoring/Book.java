package Exercices.OrderRefactoring;

public class Book extends  Product {

    @Override
    public double calculatePrice() {
        return getPrice() * 0.90;
    }
}
