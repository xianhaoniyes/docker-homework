package com.thoughtworks.capability.gtb.alice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;


@RestController
public class AliceController {

    @GetMapping("/hello")
    public String hello() throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();

//        URI uri = new URI("http://localhost:8081/hello/") ;
        ResponseEntity<String> res = restTemplate.getForEntity("http://container2:8081/hello/",String.class);
        return res.getBody();


    }
}
