package net.arons.consume_rest_api.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "external-api", url = "https://restcountries.com")
public interface ApiServiceProxy extends ApiService{
}
