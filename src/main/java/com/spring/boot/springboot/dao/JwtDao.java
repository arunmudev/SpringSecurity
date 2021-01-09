package com.spring.boot.springboot.dao;



import java.util.List;

import com.spring.boot.springboot.model.JwtRequest;

//import org.springframework.data.mongodb.repository.MongoRepository;


// public interface JwtDao extends MongoRepository<JwtRequest, String> {

// }

public interface JwtDao  {

    public List<JwtRequest> getAllData();

    public boolean insertData(JwtRequest request);

    public JwtRequest getUser(String username);

	public List<JwtRequest> getUserList();
    
}