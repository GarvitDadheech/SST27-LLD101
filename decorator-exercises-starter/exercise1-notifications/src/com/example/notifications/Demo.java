package com.example.notifications;

/**
 * Starter demo that uses only the existing Email notifier.
 * TODOs guide you to add decorators and compose them.
 */
public class Demo {
    public static void main(String[] args) {
        Notifier base = new EmailNotifier("user@example.com");

        // Baseline behavior (already works)
        System.out.println("--- Baseline ---");
        base.notify("Baseline email only.");
        System.out.println();

        // a) Email + SMS
        System.out.println("--- Email + SMS ---");
        Notifier smsAndEmail = new SmsDecorator(base, "+91-99999-11111");
        smsAndEmail.notify("Build green ✅");
        System.out.println();

        // b) Email + WhatsApp
        System.out.println("--- Email + WhatsApp ---");
        Notifier whatsappAndEmail = new WhatsAppDecorator(base, "user_wa");
        whatsappAndEmail.notify("Reminder: Meeting at 3 PM");
        System.out.println();

        // c) Email + Slack
        System.out.println("--- Email + Slack ---");
        Notifier slackAndEmail = new SlackDecorator(base, "dev-alerts");
        slackAndEmail.notify("New PR needs review");
        System.out.println();

        // d) Email + WhatsApp + Slack
        System.out.println("--- Email + WhatsApp + Slack ---");
        Notifier full = new SlackDecorator(new WhatsAppDecorator(base, "user_wa"), "deployments");
        full.notify("Deployment completed 🚀");
        System.out.println();
    }
}
