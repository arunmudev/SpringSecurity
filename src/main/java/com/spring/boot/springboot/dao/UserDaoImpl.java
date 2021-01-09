package com.spring.boot.springboot.dao;

import java.util.List;

import com.spring.boot.springboot.model.JwtRequest;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDaoImpl extends MongoRepository<JwtRequest,String>{

    

}
