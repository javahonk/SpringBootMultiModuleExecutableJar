package com.digital.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DCIMConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
