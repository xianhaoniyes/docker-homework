package com.thoughtworks.capability.gtb.alice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URISyntaxException;


@RestController
public class AliceController {

    @GetMapping("/hello")
    public String hello(RestTemplate restTemplate) {

        ResponseEntity<String> res = restTemplate.getForEntity("http://container2:8081/hello/",String.class);
        return res.getBody();


    }
}
