package Exercices.ShippingService;

public class UnknownShippingTypeException extends RuntimeException {

    public UnknownShippingTypeException(String shippingType) {
        super("Unknown shipping type: " + shippingType);
    }
}