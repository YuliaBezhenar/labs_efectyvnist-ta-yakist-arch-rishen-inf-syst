import context.DeliveryContext;
import strategies.*;

public class Main {
    public static void main(String[] args) {
        DeliveryContext context = new DeliveryContext();
        double distance = 10;  //in kilometers

        System.out.println("---Client choose Pickup---");
        context.setStrategy(new Pickup());
        System.out.println("Cost: " + context.calc(distance));

        System.out.println("\n---Client choose External Delivery---");
        context.setStrategy(new ExternalDelivery());
        System.out.println("Cost: " + context.calc(distance));

        System.out.println("\n---Client choose Internal Delivery---");
        context.setStrategy(new InternalDelivery());
        System.out.println("Cost: " + context.calc(distance));
    }
}