package com.spring.boot.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.spring.boot.springboot.model.JwtRequest;
import com.spring.boot.springboot.model.SpringModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class SpringBootController {
    
   
    @RequestMapping(value="authenticatecheck", method=RequestMethod.POST)
    public String requestMethodName(@RequestBody JwtRequest param) {
        System.out.println(param.getUsername());
        System.out.println(param.getPassword());
        return "11";
    }
    
}
