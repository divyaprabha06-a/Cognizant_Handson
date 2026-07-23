package spring_learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import spring_learn.entity.Country;

@RestController
public class CountryController {

    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code) {

        Country country = new Country();

        if (code.equalsIgnoreCase("IN")) {
            country.setCode("IN");
            country.setName("India");
        }

        return country;
    }
}
