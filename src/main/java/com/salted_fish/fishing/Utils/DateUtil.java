package com.salted_fish.fishing.Utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    /**
     * input start date and expire day number then calculate expire date
     * @param startDate
     * @return
     */
    public static Date setExpireDate(Date startDate, int lastDays) {
        Calendar currentTime = Calendar.getInstance();
        currentTime.setTime(startDate);
        currentTime.add(Calendar.DAY_OF_YEAR, lastDays);
        Date expireDate = currentTime.getTime();
        return expireDate;
    }
}