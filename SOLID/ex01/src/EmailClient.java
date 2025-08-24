public class EmailClient implements NotificationService {
    @Override
    public void sendNotification(String to, String body) {
        System.out.println("[EMAIL to=" + to + "] " + body);
    }
}