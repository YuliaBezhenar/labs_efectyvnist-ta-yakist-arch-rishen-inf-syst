package strategies;

public class Pickup implements DeliveryStrategy {
    @Override
    public double calculatePrice(double distance) {
        System.out.println("Pickup Delivery - free");
        return 0;
    }
}
