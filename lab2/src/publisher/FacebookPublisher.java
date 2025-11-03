package publisher;

import api.FacebookAPI;
import api.SocialNetworkAPI;

public class FacebookPublisher extends Publisher{
    private String login;
    private String password;

    public FacebookPublisher(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public SocialNetworkAPI connectAPI(){    //overriding the factory method
        return new FacebookAPI(login, password);
    }
}
