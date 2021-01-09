package com.spring.boot.springboot.service;

import com.spring.boot.springboot.dao.JwtDaoImpl;

import com.spring.boot.springboot.model.JwtRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

  @Autowired
  private JwtDaoImpl obj;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    JwtRequest request = obj.getUser(username);
    if(request==null)
     throw new  UsernameNotFoundException("No data found with current user");
     
    return new UserDet(request);
  }

}
