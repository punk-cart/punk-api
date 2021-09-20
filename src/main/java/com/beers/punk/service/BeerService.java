package com.beers.punk.service;

import com.beers.punk.model.PunkModel;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface BeerService extends UserDetailsService {

    ResponseEntity<List<PunkModel>> getBeerServiceCall(int beerId);
    ResponseEntity<List<PunkModel>> getBeersServiceCall();

}
