package com.example.postservice.repository;

import com.example.postservice.entity.MessageEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public class MessageRepository {

    @Repository
    public interface MessageRepositoryCustom extends MongoRepository<MessageEntity, String> {

    }
}
