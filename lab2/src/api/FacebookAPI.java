package api;

public class FacebookAPI implements SocialNetworkAPI{
    private String login;
    private String password;

    public FacebookAPI(String login, String password){
        this.login = login;
        this.password = password;
    }

    @Override
    public void login() {
        System.out.println("Login to Facebook as " + login);
    }

    @Override
    public void publish(String message) {
        System.out.println("Published in Facebook: " + message );
    }

    @Override
    public void logout() {
        System.out.println("Logged out from Facebook.\n");
    }
}
