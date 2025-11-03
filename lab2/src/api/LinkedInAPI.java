package api;

public class LinkedInAPI implements SocialNetworkAPI{
    private String email;
    private String password;

    public LinkedInAPI(String email, String password){
        this.email = email;
        this.password = password;
    }

    @Override
    public void login() {
        System.out.println("Login to LinkedIn with email: " + email);
    }

    @Override
    public void publish(String message) {
        System.out.println("Published in LinkedIn: " + message );
    }

    @Override
    public void logout() {
        System.out.println("Logged out from LinkedIn.\n");
    }
}
