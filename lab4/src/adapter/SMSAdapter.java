package adapter;

//adapter for SMS to fit notification
import notification.Notification;
import notification.SMSNotification;

public class SMSAdapter implements Notification{
    private SMSNotification sms;

    public SMSAdapter(SMSNotification sms) {
        this.sms = sms;
    }

    @Override
    public void send(String title, String message) {
        sms.sendSMS("[" + title + "]" + message);
    }
}
