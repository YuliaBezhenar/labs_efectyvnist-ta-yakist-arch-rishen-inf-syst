package notification;

//SMS notification with another fields and functions
public class SMSNotification {
    private String sender;
    private String phoneNumber;
    public SMSNotification(String sender, String phoneNumber) {
        this.sender = sender;
        this.phoneNumber = phoneNumber;
    }

    public void sendSMS(String message) {
        System.out.println("Sent SMS from " + sender + " (" + this.phoneNumber + "): " + message);
    }
}
