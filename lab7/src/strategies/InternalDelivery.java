package strategies;

public class InternalDelivery implements DeliveryStrategy {
    @Override
    public double calculatePrice(double distance) {
        System.out.println("Our Internal Delivery Service - 40 + 1 for km");
        double price;
        price = 40 + distance;
        return price;
    }
}
