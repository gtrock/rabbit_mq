package com.glint;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "it")
public class Consumer2 {
    @RabbitHandler
    public void showMsg(String msg) {
        System.out.println(("Listening queue it Received: " + msg));
    }
}
