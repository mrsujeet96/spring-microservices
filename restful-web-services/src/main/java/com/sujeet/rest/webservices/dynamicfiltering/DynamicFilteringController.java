package com.sujeet.rest.webservices.dynamicfiltering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.Arrays;
import java.util.List;

public class DynamicFilteringController {



    //    field1, field2
    @GetMapping("/filterings")
    public MappingJacksonValue retrieveSomeBeans() {
        SomeBeans someBean = new SomeBeans("value1", "value2", "value3");

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field2");

        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);

        MappingJacksonValue mapping = new MappingJacksonValue(someBean);

        mapping.setFilters(filters);

        return mapping;
    }

    // field2, field3
    @GetMapping("/filtering-lists")
    public MappingJacksonValue retrieveListOfSomeBeans() {
        List<SomeBeans> list = Arrays.asList(new SomeBeans("value1", "value2", "value3"),
                new SomeBeans("value12", "value22", "value32"));

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2", "field3");

        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);

        MappingJacksonValue mapping = new MappingJacksonValue(list);

        mapping.setFilters(filters);

        return mapping;
    }


}
