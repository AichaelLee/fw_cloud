package com.lzz.common.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;

//@Configuration
public class RabbitMqConfig {
    @Bean
    public Queue mailQueue() {
        return new Queue("mail");
    }
}
