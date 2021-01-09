package com.spring.boot.springboot.service;

import java.util.Collection;
import java.util.Collections;

import com.spring.boot.springboot.model.JwtRequest;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDet implements UserDetails {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private JwtRequest request;

    public UserDet(JwtRequest request) {
        super();
        this.request = request;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority("USER"));
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return request.getPassword();
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return request.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return true;
    }

}
