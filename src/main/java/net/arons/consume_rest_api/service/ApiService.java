package net.arons.consume_rest_api.service;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface ApiService {

    @GetMapping("/v3.1/all")
    public List<Object> getCountries();

//    @GetMapping("/products")
//    public List<Object> getProducts();
}
