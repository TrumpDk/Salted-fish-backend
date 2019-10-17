package com.salted_fish.fishing.Mapper;

import java.util.Date;

import com.salted_fish.fishing.Dto.UserDto;
import com.salted_fish.fishing.Entity.User;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserInfoMapper {

    @Select("select * from User_Info where userName = #{userName} and password = #{password}")
    User findByUser(UserDto userDto);
    
    @Update("update User_Info set expireTime = #{expireTime}, token = #{uuid} where userId = #{userId}")
    void updateExpireTime(Date expireTime, String uuid, int userId);

    @Insert("insert into User_Info values(#{userId}, #{password}, #{avatar}, #{phone}, #{token}, #{userName}, #{expireTime})")
    int createNewUser(User user);

    @Select("select * from User_Info where token = #{cookieValue}")
    User findUserByCookieValue(String cookieValue);
}