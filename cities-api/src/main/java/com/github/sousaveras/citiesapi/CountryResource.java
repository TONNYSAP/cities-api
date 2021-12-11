package com.github.sousaveras.citiesapi;


//import java.util.Scanner;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import countries.Country;
import repository.CountryRepository;

@RestController
@RequestMapping("/countries")
public class CountryResource {

   private CountryRepository repository;

   public CountryResource(CountryRepository repository) {
       this.repository = repository;
   }
   
    @GetMapping
    public Page<Country> countries(Pageable page) {
        return repository.findAll(page);
    }

}