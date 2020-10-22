package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class GreetingService {

    String sayHi() {
        return "hello world";
    }
}
