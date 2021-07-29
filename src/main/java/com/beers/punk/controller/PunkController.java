package com.beers.punk.controller;

import com.beers.punk.model.PunkModel;
import com.beers.punk.service.BeerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PunkController {

    @Autowired
    public BeerServiceImpl beerService;

    @GetMapping(path="/beers")
    public ResponseEntity<PunkModel[]> getBeers(){

        ResponseEntity<PunkModel[]> entity = beerService.getBeersServiceCall();
        return entity;
    }

    @GetMapping(path="/beers/{beerId}")
    public ResponseEntity<PunkModel[]> getBeer(@PathVariable int beerId){

        ResponseEntity<PunkModel[]> entity = beerService.getBeerServiceCall(beerId);
        return entity;
    }
}
