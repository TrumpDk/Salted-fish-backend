package com.salted_fish.fishing.ServiceImpl;

import java.util.Date;

import com.salted_fish.fishing.Dto.UserDto;
import com.salted_fish.fishing.Entity.User;
import com.salted_fish.fishing.Mapper.UserInfoMapper;
import com.salted_fish.fishing.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public User findByUserDto(UserDto userDto) {
        return userInfoMapper.findByUser(userDto);
    }

    @Override
    public int userRegister(User user) {
        return userInfoMapper.createNewUser(user);
    }

    @Override
    public void updateExpireTime(Date expireTime, String uuid, int userId) {
        userInfoMapper.updateExpireTime(expireTime, uuid, userId);
    }

    @Override
    public User findUserByCookieValue(String cookieValue) {
        return userInfoMapper.findUserByCookieValue(cookieValue);
    }
    
}