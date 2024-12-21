package com.elearning.model;

import java.time.LocalDateTime;

public class Notification {
    private String recipient;
    private String message;
    private LocalDateTime timestamp;
    private boolean isRead;

    public Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
        this.timestamp = LocalDateTime.now();
        this.isRead = false;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public boolean isRead() {
        return isRead;
    }

    public void markAsRead() {
        this.isRead = true;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "recipient='" + recipient + '\'' +
                ", message='" + message + '\'' +
                ", timestamp=" + timestamp +
                ", isRead=" + isRead +
                '}';
    }
}
