package com.example.notifications;

public abstract class NotifierDecorator implements Notifier {
    protected final Notifier wrappedNotifier;

    public NotifierDecorator(Notifier notifier) {
        this.wrappedNotifier = notifier;
    }

    @Override
    public void notify(String text) {
        wrappedNotifier.notify(text);
    }
}
