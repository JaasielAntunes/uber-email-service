package com.antunes.uberemailservice.core;

public interface EmailSenderUseCase {

    void sendEmail(String to, String subject, String body);
}
