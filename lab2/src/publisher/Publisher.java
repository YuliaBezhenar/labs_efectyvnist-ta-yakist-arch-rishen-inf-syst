package publisher;

import api.SocialNetworkAPI;

public abstract class Publisher {
    //base class with Factory Method
    //it has the main logic for publishing: login, publish, logout
    public void post(String message) {
        // Створюємо конектор (фабричний метод)
        SocialNetworkAPI api = connectAPI();
        api.login();
        api.publish(message);
        api.logout();
    }

    //Abstract Factory Method
    public abstract SocialNetworkAPI connectAPI();
}
