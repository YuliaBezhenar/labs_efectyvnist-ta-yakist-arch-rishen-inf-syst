package context;

import strategies.DeliveryStrategy;

public class DeliveryContext {
    private DeliveryStrategy strategy;

    public void setStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    public double calc(double distance) {
        if (strategy == null) {
            throw new IllegalStateException("Delivery service is null.");
        }
        return strategy.calculatePrice(distance);
    }
}
