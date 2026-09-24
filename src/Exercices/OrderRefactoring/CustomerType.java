package Exercices.OrderRefactoring;

public enum CustomerType {
    REGULAR(1.0),
    PREMIUM(0.95),
    VIP(0.90);

    private final double multiplier;

    CustomerType(double multiplier) {
        this.multiplier = multiplier;
    }

    public double applyDiscount(double price) {
        return price * multiplier;
    }
}
