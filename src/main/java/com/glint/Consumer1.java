package com.glint;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "itgeek")
public class Consumer1 {
    @RabbitHandler
    public void showMsg(String msg) {
        System.out.println(("Consumer2 Received: " + msg));
    }
}
