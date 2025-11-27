package templateMethod;

public abstract class EntityUpdater {

    //template method
    public final void update(Object entity) {
        Object received = receive(entity);

        if (!validate(received)) {
            onValidationFailed(received); // Хук
            createErrorResponse(received);
            return;
        }

        save(received);
        createSuccessResponse(received);
    }

    //steps
    protected abstract Object receive(Object entity);

    protected abstract boolean validate(Object entity);

    protected abstract void save(Object entity);

    protected abstract void createSuccessResponse(Object entity);

    protected void createErrorResponse(Object entity) {
        System.out.println("Response: 400 - Validation Failed");
    }

    // === ХУК ===
    protected void onValidationFailed(Object entity) { }
}
