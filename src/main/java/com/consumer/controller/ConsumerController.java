package com.consumer.controller;

import com.consumer.model.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Value("${producer.url}")
    private String url;

    @GetMapping("/person")
    public Person getPerson() {
        Person person = new RestTemplate().getForObject(url, Person.class);

        return person;
    }


}
