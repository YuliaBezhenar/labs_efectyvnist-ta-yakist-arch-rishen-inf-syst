package templateMethod;

import model.Product;

public class ProductUpdater extends EntityUpdater {
    @Override
    protected Object receive(Object entity) {
        System.out.println("Receiving product...");
        return (Product) entity;
    }

    @Override
    protected boolean validate(Object entity) {  //example validation
        Product product = (Product) entity;
        return product.getPrice() > 0;
    }

    @Override
    protected void save(Object entity) {
        System.out.println("Saving product...");
    }

    @Override
    protected void createSuccessResponse(Object entity) {
        System.out.println("Response: 200 - Product updated successfully");
    }

    @Override
    protected void onValidationFailed(Object entity) {
        //notify
        System.out.println("ALERT: Product validation failed!");
    }
}
