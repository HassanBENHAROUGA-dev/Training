package Exercices.OrderRefactoring;

public class Food extends  Product{

    @Override
    public double calculatePrice() {
        return getPrice() * 0.95;
    }
}
