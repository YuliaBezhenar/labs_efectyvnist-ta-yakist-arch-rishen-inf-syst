
import publisher.Publisher;
import publisher.FacebookPublisher;
import publisher.LinkedInPublisher;

public class Main {
    public static void main(String[] args) {
        Publisher facebook = new FacebookPublisher("User", "password");
        facebook.post("Hello! Nice to meet you!");

        Publisher linkedin = new LinkedInPublisher("user@gmail.com", "another_password");
        linkedin.post("Hello everyone on LinkedIn!");
    }
}