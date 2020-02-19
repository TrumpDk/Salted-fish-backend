package com.salted_fish.fishing.Controller;

import com.salted_fish.fishing.Entity.User;
import com.salted_fish.fishing.Service.UserService;
import com.salted_fish.fishing.Utils.CookieUtil;
import com.salted_fish.fishing.Utils.DateUtil;
import com.salted_fish.fishing.Utils.JsonUtil;
import com.salted_fish.fishing.Utils.UuidUtil;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

import javax.servlet.http.HttpSession;

import com.salted_fish.fishing.Dto.UserDto;
import com.salted_fish.fishing.Dto.UserInfo;
import com.salted_fish.fishing.Dto.UserRegisterDto;

@RestController
public class UserController {

    @Autowired
    private UserService uService;

    private Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @PostMapping("/LogIn")
    @ResponseBody
    public JsonUtil<?> logIn(@RequestBody UserDto uDto, HttpSession session) {
        logger.info("get into LogIn" + new Date());
        User user = null;
        try {
            user = uService.findByUserDto(uDto);
            // if user exists response with cookie
            if (user != null) {
                String uuid = UuidUtil.getUUID();
                session.setAttribute("userInfo", user);
                CookieUtil.setCookie("SESSIONV1", uuid);
                Date expireTime = DateUtil.setExpireDate(new Date(), 7);
                uService.updateExpireTime(expireTime, uuid, user.getUserId());
                UserInfo userInfo = new UserInfo(user.getUserName(), user.getAvatar());
                return new JsonUtil<>(userInfo, "200", "log in successfully");
            } else {
                // response user not found code and show message
                return new JsonUtil<>("201", "user name or password is invalid");
            }
        } catch (Exception e) {
            // catch error and response unsuccessful code and show error
            logger.error("got an error while searching user at " + new Date());
            return new JsonUtil<>("201", "log in failed with error");
        }
    }

    @PostMapping("/Register")
    @ResponseBody
    public JsonUtil<?> userRegister(@RequestBody UserRegisterDto uRegisterDto) {
        logger.info("get into Register" + new Date());
        User user = new User(null, uRegisterDto.getUserName(), uRegisterDto.getPassword(), uRegisterDto.getPhone(), null, null, null);
        try {
            int status = uService.userRegister(user);
            logger.info(status + " row is inserted");
            return new JsonUtil<>("200", "new user added successfully");
        } catch(Exception e) {
            logger.error(e.getMessage());
            return new JsonUtil<>("201", "add new user failed");
        }
    }

    @PostMapping("/FindUserByName")
    @ResponseBody
    public JsonUtil<?> findUserByName(@RequestParam(value = "userName") String userName) {
        logger.info("user name is " + userName);
        return new JsonUtil<>(userName, "200", "successful");
    }

    @GetMapping("/checkLogIn")
    @ResponseBody
    public JsonUtil<?> testMapping() {
        return new JsonUtil<>("200", "you had already logged in");
    }
}