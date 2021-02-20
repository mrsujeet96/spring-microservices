package com.sujeet.rest.webservices.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

//    field1
    @GetMapping("/filtering")
    public SomeBean retrieveSomeBean(){
        return new SomeBean("value1","value2","value3");

    }

//    field2
    @GetMapping("/filtering-list")
    public List<SomeBean> retrieveListOfSomeBean(){
        return Arrays.asList( new  SomeBean("value1","value2","value3"),
        new SomeBean("value11","value22","value33"));


    }

}
