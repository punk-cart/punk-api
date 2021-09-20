package com.beers.punk.service.impl;

import com.beers.punk.mapping.PunkModelMappingToDB;
import com.beers.punk.model.PunkModel;
import com.beers.punk.model.PunkModelToDB;
import com.beers.punk.repository.BeerRepository;
import com.beers.punk.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class BeerServiceImpl implements BeerService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    BeerRepository beerRepository;

    @Override
    public ResponseEntity<List<PunkModel>> getBeerServiceCall(int beerId){

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> e = new HttpEntity<>("parameters", headers);
        return restTemplate.exchange("https://api.punkapi.com/v2/beers/"+beerId, HttpMethod.GET,e,new ParameterizedTypeReference<List<PunkModel>>() {});
    }

    @Override
    public ResponseEntity<List<PunkModel>> getBeersServiceCall() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> e = new HttpEntity<>("parameters", headers);
        ResponseEntity<List<PunkModel>> entity = restTemplate.exchange("https://api.punkapi.com/v2/beers/", HttpMethod.GET,e,  new ParameterizedTypeReference<List<PunkModel>>() {});
        List<PunkModelToDB> list = Objects.requireNonNull(entity.getBody()).stream().map(punkModel -> PunkModelMappingToDB.mapTo(punkModel)).collect(Collectors.toList());
        list.stream().forEach(punkModelToDB -> beerRepository.save(punkModelToDB));

        return entity;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return new User("root", "root", new ArrayList<>());
    }
}
