package templateMethod;

import model.Order;

public class OrderUpdater extends EntityUpdater {

    @Override
    protected Object receive(Object entity) {
        System.out.println("Receiving order...");
        return (Order) entity;
    }

    @Override
    protected boolean validate(Object entity) {
        return true;
    }

    @Override
    protected void save(Object entity) {
        System.out.println("Saving order...");
    }

    @Override
    protected void createSuccessResponse(Object entity) {
        Order order = (Order) entity;

        String json = "{ \"id\": " + order.getId() +
                ", \"status\": \"" + order.getStatus() + "\" }";

        System.out.println("Response: 200 - Order updated");
        System.out.println("Order JSON: " + json);
    }
}
