package com.spring.boot.springboot.model;

import java.io.Serializable;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class JwtResponse implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static void main(String ar[]){
        System.out.println(BCrypt.hashpw("Test@123", BCrypt.gensalt(12)));
    }
}
