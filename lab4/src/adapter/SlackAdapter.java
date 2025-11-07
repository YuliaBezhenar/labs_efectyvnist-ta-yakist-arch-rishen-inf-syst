package adapter;

//adapter for slack to fit notification
import notification.Notification;
import notification.SlackNotification;

public class SlackAdapter  implements Notification{
    private SlackNotification slack;
    private String chatId;

    public SlackAdapter(SlackNotification slack, String chatId) {
        this.slack = slack;
        this.chatId = chatId;
    }

    @Override
    public void send(String title, String message) {
        slack.login();
        slack.sendMessage(chatId, "[" + title + "] " + message);
    }



}
