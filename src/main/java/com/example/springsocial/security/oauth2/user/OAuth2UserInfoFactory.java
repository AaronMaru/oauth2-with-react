package com.example.springsocial.security.oauth2.user;

import com.example.springsocial.Exception.OAuth2AuthenticationProcessingException;
import com.example.springsocial.model.AuthProvider;

import java.util.Map;

/**
 * Created by : maru
 * Date  : 12/9/2019
 * Time  : 3:52 PM
 */

public class OAuth2UserInfoFactory {

    public static OAuth2UserInfo getOAuth2UserInfo(String registrationId, Map<String, Object> attributes) {
        if (registrationId.equalsIgnoreCase(AuthProvider.google.toString())) {
            return new GoogleOAuth2UserInfo(attributes);
        } else if (registrationId.equalsIgnoreCase(AuthProvider.facebook.toString())) {
            return new FacebookOAuth2UserInfo(attributes);
        } else if (registrationId.equalsIgnoreCase(AuthProvider.github.toString())) {
            return new GithubOAuth2UserInfo(attributes);
        } else {
            throw new OAuth2AuthenticationProcessingException("sorry! login with" + registrationId + "is not supported yet");
        }
    }
}
