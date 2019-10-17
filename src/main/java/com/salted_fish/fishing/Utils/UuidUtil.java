package com.salted_fish.fishing.Utils;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class UuidUtil {

    /**
     * return a uuid
     * @return String
     */
    public static String getUUID() {
        String uuid = UUID.randomUUID().toString();
        String[] temp = uuid.split("\\-");
        return temp[3] + temp[4];
    }
}