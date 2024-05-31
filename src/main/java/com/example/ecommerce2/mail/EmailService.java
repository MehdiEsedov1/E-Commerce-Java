package com.example.ecommerce2.mail;

public interface EmailService {
    void sendSimpleMessage(String to, String subject, String text);
    void sendMessageWithAttachment(String to, String subject, String text);
}
