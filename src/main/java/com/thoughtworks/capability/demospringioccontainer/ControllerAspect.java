package com.thoughtworks.capability.demospringioccontainer;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ControllerAspect {

    @Pointcut("execution(* com.thoughtworks.capability.demospringioccontainer.GreetingController.greet(..))")
    public void pointcut(){

    }

    @Before(value = "pointcut()")
    public GreetingService  newGreeting(){
         return new GreetingService();
    }

}
