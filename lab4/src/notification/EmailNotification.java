package notification;

//email notification
public class EmailNotification implements Notification {
    private String adminEmail;

    public EmailNotification(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    @Override
    public void send(String title, String message) {
        System.out.println("Sent email with title: '" + title + "' that says: '" + message + "'\nFROM: " + adminEmail);
    }
}

