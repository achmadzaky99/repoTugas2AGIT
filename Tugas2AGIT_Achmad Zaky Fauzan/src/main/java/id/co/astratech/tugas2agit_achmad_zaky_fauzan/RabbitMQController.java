package id.co.astratech.tugas2agit_achmad_zaky_fauzan;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMQController {

    private static final String queue = "ZakyQueue";

    @RabbitListener(queues = queue)
    public void processMessage(String message) {
        System.out.println("Message from RabbitMQ: " + message);
    }

}
