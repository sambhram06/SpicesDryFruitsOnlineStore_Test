package com.SpicesDryFruitsOnlineStore_Test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpicesDryFruitsOnlineStore_Test.entity.JwtRequest;
import com.SpicesDryFruitsOnlineStore_Test.entity.JwtResponse;
import com.SpicesDryFruitsOnlineStore_Test.service.JwtService;



@RestController       //resquest body and controller
@CrossOrigin
public class JwtController {

    @Autowired
    private JwtService jwtService;

    @PostMapping({"/authenticate"})
    public JwtResponse createJwtToken(@RequestBody JwtRequest jwtRequest) throws Exception {
        return jwtService.createJwtToken(jwtRequest);
    }
}