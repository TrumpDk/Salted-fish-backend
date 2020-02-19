package com.salted_fish.fishing.Mapper;

import java.util.Date;

import com.salted_fish.fishing.Dto.UserDto;
import com.salted_fish.fishing.Entity.User;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserInfoMapper {

    @Select("select * from User_Info where userName = #{userName} and password = #{password}")
    public User findByUser(UserDto userDto);
    
    @Update("update User_Info set expireTime = #{expireTime}, token = #{uuid} where userId = #{userId}")
    public void updateExpireTime(Date expireTime, String uuid, int userId);

    @Insert("insert into User_Info values(#{userId}, #{password}, #{avatar}, #{phone}, #{token}, #{userName}, #{expireTime})")
    public int createNewUser(User user);

    @Select("select * from User_Info where token = #{cookieValue}")
    public User findUserByCookieValue(String cookieValue);
}