package com.kedu.project.chatbot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("")
@RestController
public class ChatBotController {
    @Autowired
    private ChatBotService chatBotService;    
}
