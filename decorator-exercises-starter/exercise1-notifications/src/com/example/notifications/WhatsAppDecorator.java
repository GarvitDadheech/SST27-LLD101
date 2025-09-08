package com.example.notifications;

public class WhatsAppDecorator extends NotifierDecorator {
    private final String userId;

    public WhatsAppDecorator(Notifier notifier, String userId) {
        super(notifier);
        this.userId = userId;
    }

    @Override
    public void notify(String text) {
        System.out.println("[WHATSAPP -> " + userId + "]: " + text);
        super.notify(text);
    }
}
