package notification;

import java.util.Locale;

public abstract class NotificationFactory {
    public static Notification createNotification(String type) throws IllegalAccessException {
        switch (type.toLowerCase()) {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SMSNotification();
            case "push":
                return new PushNotification();
            default:
                throw new IllegalAccessException("Invalid type");
        }
    }
}
