package publisher;

import api.LinkedInAPI;
import api.SocialNetworkAPI;

public class LinkedInPublisher extends Publisher {
    private String email;
    private String password;

    public LinkedInPublisher(String email, String password){
        this.email = email;
        this.password = password;
    }

    @Override
    public SocialNetworkAPI connectAPI(){    //overriding the factory method
        return new LinkedInAPI(email, password);
    }
}
