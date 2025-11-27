import model.*;
import templateMethod.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("---Updating Product---");
        EntityUpdater productUpdater = new ProductUpdater();
        Product product = new Product(1, -50.0, "Test Product"); //product with negative price
        productUpdater.update(product);


        System.out.println("\n---Updating User---");
        EntityUpdater userUpdater = new UserUpdater();
        User user = new User(10, "test@mail.com");
        //for example user changes his email
        user.changeEmail();
        userUpdater.update(user);


        System.out.println("\n---Updating Order---");
        EntityUpdater orderUpdater = new OrderUpdater();
        Order order = new Order(100, "CREATED");
        orderUpdater.update(order);
    }
}
