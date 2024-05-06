package com.example.postservice.controller;

import com.example.postservice.entity.MessageEntity;
import com.example.postservice.service.MessageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/message")
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService=messageService;
    }

    @PostMapping()
    public MessageEntity saveMessage(@RequestBody MessageEntity message) {
        return messageService.save(message);
    }

    @GetMapping()
    public List<MessageEntity> getAllMessages() {
        return messageService.getMessages();
    }

}
