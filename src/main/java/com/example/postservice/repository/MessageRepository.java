package com.example.postservice.repository;

import com.example.postservice.entity.MessageEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface MessageRepository extends MongoRepository<MessageEntity, String> {
        List<MessageEntity> findBySenderUsername(String senderUsername);
    }

