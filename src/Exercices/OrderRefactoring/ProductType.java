package Exercices.OrderRefactoring;

public enum ProductType {
    Book,
    Electronic,
    Food;

    public static ProductType from(String value) {
        try {
            return ProductType.valueOf(value);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(
                    "Unknown product type: " + value
            );
        }
    }
}