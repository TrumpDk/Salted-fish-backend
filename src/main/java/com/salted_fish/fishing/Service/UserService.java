package com.salted_fish.fishing.Service;

import java.util.Date;

import com.salted_fish.fishing.Dto.UserDto;
import com.salted_fish.fishing.Entity.User;

public interface UserService {

    public User findByUserDto(UserDto userDto);

    public void updateExpireTime(Date expireTime, String uuid, int userId);

    public int userRegister(User user);

    public User findUserByCookieValue(String cookieValue);

    public void userLogout(int userId);
}