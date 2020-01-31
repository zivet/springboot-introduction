package com.ioverlap.dojo.websocket.controller;

import com.ioverlap.dojo.websocket.model.Greeting;
import com.ioverlap.dojo.websocket.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @MessageMapping(value = "/greeting")
    @SendTo(value = "/channel/chat")
    public Greeting greeting(Message message) {
        return new Greeting("Hello " + message.getName());
    }
}
