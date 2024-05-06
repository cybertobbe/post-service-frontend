package com.example.postservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="messages")
public class MessageEntity {

    @Id
    private String id;
    private String senderUsername;
    private String recieverUsername;
    private String message;

    public MessageEntity(String id, String senderUsername, String receiverUsername, String message ) {

        this.id = id;
        this.senderUsername = senderUsername;
        this.recieverUsername = receiverUsername;
        this.message = message;

    }

}
