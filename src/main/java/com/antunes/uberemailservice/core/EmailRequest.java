package com.antunes.uberemailservice.core;

public record EmailRequest(String to, String subject, String body) {
}
