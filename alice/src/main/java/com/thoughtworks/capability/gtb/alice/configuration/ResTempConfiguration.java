package com.thoughtworks.capability.gtb.alice.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ResTempConfiguration {


    @Bean
    public RestTemplate genResTemp(RestTemplateBuilder builder){return  builder.build();}
}
