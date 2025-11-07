package notification;

//slack notification with another fields and functions
public class SlackNotification {
    private String login;
    private String apiKey;

    public SlackNotification(String login, String apiKey) {
        this.login = login;
        this.apiKey = apiKey;
    }

    public void login() {
        System.out.println("Login to Slack: " + login);
    }

    public void sendMessage(String chatId, String message) {
        System.out.println("Sent message to chat #" + chatId + ": " + message);
    }

}
