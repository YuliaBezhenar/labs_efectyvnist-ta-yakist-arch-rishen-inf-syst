package strategies;

public class ExternalDelivery implements DeliveryStrategy {
    @Override
    public double calculatePrice(double distance) {
        System.out.println("External Delivery Service: basic price (50) + 1.5 for km");
        double price;
        price = 50 + (distance * 1.5);
        return price;
    }
}
