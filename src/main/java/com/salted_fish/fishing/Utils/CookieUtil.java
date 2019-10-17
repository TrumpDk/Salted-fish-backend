package com.salted_fish.fishing.Utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CookieUtil {

    public static final int COOKIE_MAX_AGE = 7 * 24 * 3600;

    private static HttpServletResponse response;

    @Autowired
    private HttpServletResponse response2;

    private static HttpServletRequest request;

    @Autowired
    private HttpServletRequest request2;

    @PostConstruct
    public void beforeInit() {
        request = request2;
        response = response2;
    }

    /**
     * get cookie object by name
     *
     * @param request
     * @param name
     * @return
     */
    public static Cookie getCookie(String name) {
        Cookie[] cookies = request.getCookies();
        if (cookies == null || cookies.length < 1) {
            return null;
        }
        Cookie cookie = null;
        for (Cookie c : cookies) {
            if (name.equals(c.getName())) {
                cookie = c;
                break;
            }
        }
        return cookie;
    }

    /**
     * get cookie by name
     *
     * @param request
     * @param name
     * @return
     */
    public static String getCookieValue(String name) {
        Cookie cookie = getCookie(name);
        if (cookie != null) {
            return cookie.getValue();
        }
        return null;
    }

    /**
     * remove cookie
     * 
     * @param request
     * @param response
     * @param name
     */
    public static void removeCookie(String name) {
        if (null == name) {
            return;
        }
        Cookie cookie = getCookie(name);
        if (null != cookie) {
            cookie.setPath("/");
            cookie.setValue("");
            cookie.setMaxAge(0);
            response.addCookie(cookie);
        }
    }

    /**
     * add a new cookie which can be customized
     *
     * @param response
     * @param name
     * @param value
     * @param maxValue
     */
    public static void setCookie(String name, String value, int maxValue) {
        if (name == null) {
            return;
        }
        if (null == value) {
            value = "";
        }
        Cookie cookie = new Cookie(name, value);
        cookie.setPath("/");
        if (maxValue != 0) {
            cookie.setMaxAge(maxValue);
        } else {
            cookie.setMaxAge(COOKIE_MAX_AGE);
        }
        response.addCookie(cookie);
        try {
            response.flushBuffer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * add a new cookie
     *
     * @param response
     * @param name
     * @param value
     */
    public static void setCookie(String name, String value) {
        setCookie(name, value, COOKIE_MAX_AGE);
    }

    /**
     * put cookie into map
     * 
     * @param request
     * @return
     */
    public static Map<String, Cookie> getCookieMap() {
        Map<String, Cookie> cookieMap = new HashMap<>();
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length > 1) {
            for (Cookie cookie : cookies) {
                cookieMap.put(cookie.getName(), cookie);
            }
        }
        return cookieMap;
    }

}