package com.salted_fish.fishing.Controller;

import java.util.List;

import com.salted_fish.fishing.Entity.User;
import com.salted_fish.fishing.Mapper.UserInfoMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.salted_fish.fishing.Dto.UserDto;

@RestController
public class UserController {

    @Autowired
    private UserInfoMapper userInfoMapper;

    Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @PostMapping("/LogIn")
    @ResponseBody
    public List<User> logIn(@RequestBody UserDto uDto) {
        List<User> user = userInfoMapper.findByUser(uDto);
        return user;
    }
}