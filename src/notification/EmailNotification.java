package notification;

public class EmailNotification implements Notification {

    @Override
    public void send(String msg) {
        System.out.println("Sending Email: " + msg);
        NotificationLogger.getInstance().log("Email notification sent");
    }
}
