package com.example.springsocial.Exception;


import org.springframework.security.core.AuthenticationException;

/**
 * Created by : maru
 * Date  : 12/9/2019
 * Time  : 4:36 PM
 */

public class OAuth2AuthenticationProcessingException extends AuthenticationException {

    public OAuth2AuthenticationProcessingException(String msg) {
        super(msg);
    }

    public OAuth2AuthenticationProcessingException(String msg, Throwable t) {
        super(msg, t);
    }

}
