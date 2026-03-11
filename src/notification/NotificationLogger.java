package notification;

public class NotificationLogger {
    private static NotificationLogger instance;

    private NotificationLogger() {};

    public static NotificationLogger getInstance() {
        if(instance == null) {
            instance = new NotificationLogger();
        }
        return instance;
    }
    public void log(String msg) {
        System.out.println("[LOG] " + msg);
    }
}
