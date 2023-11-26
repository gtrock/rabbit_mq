package com.glint;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "geek")
public class Consumer3 {
    @RabbitHandler
    public void showMsg(String msg) {
        System.out.println(("Listening queue geek Received: " + msg));
    }
}
