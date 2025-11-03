package api;

public interface SocialNetworkAPI {
    //some api for connecting to social media: for login, publish ect
    void login();
    void publish(String message);
    void logout();
}
