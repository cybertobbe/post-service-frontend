package com.example.postservice.dto;

public class EntityDto {
    private String id;
    private String senderUsername;
    private String recieverUsername;
    private String message;

    public EntityDto(String id, String senderUsername, String recieverUsername, String message) {
        this.id = id;
        this.senderUsername = senderUsername;
        this.recieverUsername = recieverUsername;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public String getSenderUsername() {
        return senderUsername;
    }

    public String getRecieverUsername() {
        return recieverUsername;
    }

    public String getMessage() {
        return message;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSenderUsername(String senderUsername) {
        this.senderUsername = senderUsername;
    }

    public void setRecieverUsername(String recieverUsername) {
        this.recieverUsername = recieverUsername;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
