package com.dishant.java.redisconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    StringRedisTemplate template;

    @GetMapping
    public void a(){
        template.convertAndSend("chat", "Hello from Redis!");
    }
}
