package net.okur.ibmmqjms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.JmsException;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableJms
public class MessageController {

    public static final String DESTINATION_NAME = "DEV.QUEUE.1";
    private final JmsTemplate jmsTemplate;

    @Autowired
    public MessageController(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @GetMapping("send")
    public String send() {
        try {
            jmsTemplate.convertAndSend(DESTINATION_NAME, "faecon is here");
            return "OK";
        } catch (JmsException exception) {
            exception.printStackTrace();
            return "FAIL";
        }
    }

    @GetMapping("received")
    public String received() {
        try {
            return jmsTemplate.receiveAndConvert(DESTINATION_NAME).toString();

        } catch (JmsException exception) {
            exception.printStackTrace();
            return "FAIL";
        }
    }

}
