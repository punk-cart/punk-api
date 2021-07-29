package com.beers.punk.service;

import com.beers.punk.model.PunkModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class BeerServiceImpl {

    @Autowired
    RestTemplate restTemplate;

    public ResponseEntity<PunkModel[]> getBeerServiceCall(int beerId){

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> e = new HttpEntity<String>("parameters", headers);
        ResponseEntity<PunkModel[]> entity = restTemplate.exchange("https://api.punkapi.com/v2/beers/"+beerId, HttpMethod.GET,e, PunkModel[].class);

        return entity;
    }

    public ResponseEntity<PunkModel[]> getBeersServiceCall() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> e = new HttpEntity<String>("parameters", headers);
        ResponseEntity<PunkModel[]> entity = restTemplate.exchange("https://api.punkapi.com/v2/beers/", HttpMethod.GET,e, PunkModel[].class);

        return entity;
    }
}
