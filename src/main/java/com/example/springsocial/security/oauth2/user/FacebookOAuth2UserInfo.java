package com.example.springsocial.security.oauth2.user;

import java.util.Map;

/**
 * Created by : maru
 * Date  : 12/9/2019
 * Time  : 4:19 PM
 */

public class FacebookOAuth2UserInfo extends OAuth2UserInfo {

    public FacebookOAuth2UserInfo(Map<String, Object> attributes) {
        super(attributes);
    }

    @Override
    public String getId() {
        return (String) attributes.get("id");
    }

    @Override
    public String getName() {
        return (String) attributes.get("name");
    }

    @Override
    public String getEmail() {
        return (String) attributes.get("email");
    }

    @Override
    public String getImageUrl() {
        if(attributes.containsKey("picture")) {
            Map<String, Object> pictureObj = (Map<String, Object>) attributes.get("picture");
            if (pictureObj.containsKey("data")) {
                Map<String, Object> dataObject = (Map<String, Object>) pictureObj.get("data");
                if (dataObject.containsKey("ur")) {
                    return (String) dataObject.get("url");
                }
            }
        }
        return null;
    }
}
