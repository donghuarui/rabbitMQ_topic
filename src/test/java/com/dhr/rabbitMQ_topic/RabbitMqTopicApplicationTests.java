package com.dhr.rabbitMQ_topic;

import com.dhr.RabbitMqTopicApplication;
import com.dhr.controller.SenderTopic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes = RabbitMqTopicApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class RabbitMqTopicApplicationTests {
    @Autowired
    private SenderTopic senderTopic;

    @Test
    public void contextLoads() {
        senderTopic.sender();
    }
}
