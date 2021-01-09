package com.spring.boot.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import com.spring.boot.springboot.dao.JwtDao;
import com.spring.boot.springboot.model.JwtRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class JWTAuthenticationController {

    @Autowired
    private JwtDao insDao;

    /**
     * Generate AUthenticaion token
     */
    @GetMapping("/fetch")
    public ResponseEntity<List<JwtRequest>> getData() {

        try {
            List<JwtRequest> list = new ArrayList<>();

            insDao.getAllData().forEach(list::add);
            //insDao.save(request);
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @RequestMapping(value="/insert" ,method=RequestMethod.POST)
    public boolean insertData(@RequestBody JwtRequest request){
        try {
           request.setPassword(BCrypt.hashpw(request.getPassword(), BCrypt.gensalt(12)));
           insDao.insertData(request);
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
