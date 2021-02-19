package com.sujeet.rest.webservices.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class HelloWorldController {
    @Autowired
    private MessageSource messageSource;

@GetMapping( path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }


    @GetMapping( path = "/hello-world-bean")
    public HelloWorldBean helloWorldbean(){
        return new  HelloWorldBean("Hello World");
    }
   ///hello-world/path-variable/sujeet
    @GetMapping( path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new  HelloWorldBean(String.format("Hello World %s" ,name));
    }


    @GetMapping( path = "/hello-world-internationalized")
    public String helloWorldworldinternationalized(){
        return  messageSource.getMessage("good.morning.message",null, LocaleContextHolder.getLocale());
    }
}
