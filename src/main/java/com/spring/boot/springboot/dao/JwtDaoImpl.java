package com.spring.boot.springboot.dao;

import java.util.List;

import com.spring.boot.springboot.model.JwtRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class JwtDaoImpl implements JwtDao {

    @Autowired
    private MongoTemplate template;

    @Override
    public List<JwtRequest> getAllData() {

        return template.findAll(JwtRequest.class);
    }

    @Override
    public boolean insertData(JwtRequest request) {
        try {
            template.save(request);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    @Override
    public JwtRequest getUser(String username) {
        Query query = new Query();
        query.addCriteria(Criteria.where("username").is(username));
        return template.findOne(query, JwtRequest.class);

    }

    @Override
    public List<JwtRequest> getUserList() {

        return template.findAll(JwtRequest.class);
    }

}
