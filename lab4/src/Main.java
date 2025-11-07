
import notification.*;
import adapter.*;

public class Main {
    public static void main(String[] args) {
        //basic email notification
        Notification email = new EmailNotification("admin@gmail.com");
        //slack notification with adapter
        SlackNotification slackNotification = new SlackNotification("admin", "SOMEAPIKEY123");
        Notification slack = new SlackAdapter(slackNotification, "123");
        //SMS notification with adapter
        SMSNotification smsNotification = new SMSNotification("Admin", "+380123456789");
        Notification sms = new SMSAdapter(smsNotification);

        String title = "System Update";
        String message = "Dear users! The system will restart tonight. Be sure to manage your time.";
        email.send(title, message);
        System.out.println("\n----------------------------\n");
        slack.send(title, message);
        System.out.println("\n----------------------------\n");
        sms.send(title, message);

    }
}