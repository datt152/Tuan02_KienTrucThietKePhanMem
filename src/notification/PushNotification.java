package notification;

public class PushNotification implements Notification {
    @Override
    public void send(String msg) {
        System.out.println("Sending Push: " + msg);
        NotificationLogger.getInstance().log("Push notification sent");
    }
}
