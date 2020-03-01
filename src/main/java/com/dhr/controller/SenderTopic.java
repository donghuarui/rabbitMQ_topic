package com.dhr.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SenderTopic {

    @Autowired
    private AmqpTemplate template;

    public void sender() {
        template.convertAndSend("exchange", "topic.message", "hello topic1");
        template.convertAndSend("exchange", "topic.messages", "hello topic2");
    }
}
