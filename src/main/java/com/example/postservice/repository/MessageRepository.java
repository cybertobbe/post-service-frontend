package com.example.postservice.repository;

import com.example.postservice.entity.MessageEntity;
import org.springframework.data.mongodb.repository.MongoRepository;


   public interface MessageRepository extends MongoRepository<MessageEntity, String> {

    }

