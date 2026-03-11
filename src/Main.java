import notification.Notification;
import notification.NotificationFactory;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        // Test SMS message
        Notification n1 = NotificationFactory.createNotification("sms");
        n1.send("Hello SMS message");

        // Test Email Message
        Notification n2 = NotificationFactory.createNotification("email");
        n2.send("Hello Email message");

        // Test push messgae
        Notification n3 = NotificationFactory.createNotification("push");
        n3.send("Hello Push message");

    }
}