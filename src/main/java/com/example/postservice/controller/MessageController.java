package com.example.postservice.controller;

import com.example.postservice.dto.EntityDto;
import com.example.postservice.entity.MessageEntity;
import com.example.postservice.service.MessageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService=messageService;
    }

    @PostMapping("/message")
    public MessageEntity saveMessage(@RequestBody MessageEntity message) {
        return messageService.save(message);
    }

    @GetMapping("/message")
    public List<EntityDto> getAllMessages() {
        return messageService.getMessages().stream()
                .map(messageService::mapToDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/message/sender/{senderUsername}")
    public List<EntityDto> getMessagesBySender(@PathVariable String senderUsername) {
        return messageService.findBySenderUsername(senderUsername);
    }

}
