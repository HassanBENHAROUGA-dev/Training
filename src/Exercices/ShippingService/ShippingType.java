package Exercices.ShippingService;

public enum ShippingType {
    STANDARD,
    EXPRESS,
    SAME_DAY;

    public static ShippingType from(String name) {
        if (name == null) {
            throw new UnknownShippingTypeException(null);
        }
        return switch (name) {
            case "Standard" -> STANDARD;
            case "Express" -> EXPRESS;
            case "SAME_DAY" -> SAME_DAY;
            default -> throw new UnknownShippingTypeException(name);
        };
    }
}
