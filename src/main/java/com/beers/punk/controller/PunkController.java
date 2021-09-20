package com.beers.punk.controller;

import com.beers.punk.controller.config.SecurityConfigure;
import com.beers.punk.model.PunkModel;
import com.beers.punk.model.jwt.AuthenticationRequest;
import com.beers.punk.model.jwt.AuthenticationResponse;
import com.beers.punk.service.BeerService;
import com.beers.punk.service.jwtservice.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Import(SecurityConfigure.class)
@RestController
@RequestMapping("/api")
public class PunkController {

    @Autowired
    public BeerService beerService;
    @Autowired
    public AuthenticationManager authenticationManager;
    @Autowired
    public JWTUtil jwtUtil;

    @GetMapping(path="/hello")
    public String helloWorld(){
        return "Hello World";
    }

    @PostMapping(path = "/authenticate")
    public ResponseEntity<AuthenticationResponse> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUserName(), authenticationRequest.getPassword())
            );
        }
        catch (BadCredentialsException exception){
            throw new Exception("Incorrect Username and Password", exception);
        }

        final UserDetails userDetails = beerService.loadUserByUsername(authenticationRequest.getUserName());
        final String jwt = jwtUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }

    @GetMapping(path="/beers")
    public ResponseEntity<List<PunkModel>> getBeers(){

        ResponseEntity<List<PunkModel>> entity = beerService.getBeersServiceCall();

        return entity;
    }

    @GetMapping(path="/beers/{beerId}")
    public ResponseEntity<List<PunkModel>> getBeer(@PathVariable int beerId){

        ResponseEntity<List<PunkModel>> entity = beerService.getBeerServiceCall(beerId);
        return entity;
    }



}
