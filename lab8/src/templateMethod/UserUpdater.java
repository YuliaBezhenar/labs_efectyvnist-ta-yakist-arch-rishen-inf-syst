package templateMethod;

import model.User;

public class UserUpdater extends EntityUpdater {
    @Override
    protected Object receive(Object entity) {
        System.out.println("Receiving user...");
        return (User) entity;
    }

    @Override
    protected boolean validate(Object entity) {
        User user = (User) entity;
        return !user.isEmailChanged();
    }

    @Override
    protected void save(Object entity) {
        System.out.println("Saving user...");
    }

    @Override
    protected void createSuccessResponse(Object entity) {
        System.out.println("Response: 200 - User updated successfully");
    }
}
