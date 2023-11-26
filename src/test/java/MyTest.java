import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.glint.Main;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Main.class)
public class MyTest {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Test
    public void testSend(){
        rabbitTemplate.convertAndSend("itgeek","我要红包");
    }  

    @Test
    public void testSendFanout(){
        rabbitTemplate.convertAndSend("exchange","", "fanout mode msg");
    }

    @Test
    public void testSendTopic1(){
        rabbitTemplate.convertAndSend("topictest","goods.aaa", "Topic mode msg");
    }

    @Test
    public void testSendTopic2(){
        rabbitTemplate.convertAndSend("topictest","article.log", "Topic mode msg");
    }

    @Test
    public void testSendTopic3(){
        rabbitTemplate.convertAndSend("topictest","goods.log", "Topic mode msg");
    }
}
