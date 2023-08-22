package net.arons.consume_rest_api.controller;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
import net.arons.consume_rest_api.service.ApiService;
import net.arons.consume_rest_api.service.ApiServiceProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.Arrays;
//import java.util.List;

@RestController
@EnableFeignClients(basePackageClasses = ApiServiceProxy.class)
public class ApiController implements ApiService {

    private ApiServiceProxy proxy;

    public ApiController(ApiServiceProxy proxy) {
        this.proxy = proxy;
    }

    @Override
    @GetMapping("/v3.1/all")
    public List<Object> getCountries() {
        return proxy.getCountries();
    }

//    @Override
//    @GetMapping("products")
//    public List<Object> getProducts() {
//        return proxy.getProducts();
//    }

//    @Autowired
//    private RestTemplate restTemplate;
//
//    private static String url = "https://restcountries.com/v3.1/all";
//
//    @GetMapping("/countries")
//    public List<Object> getCountries(){
//        Object[] countries = restTemplate.getForObject(url, Object[].class);
//        return Arrays.asList(countries);
//    }
}
