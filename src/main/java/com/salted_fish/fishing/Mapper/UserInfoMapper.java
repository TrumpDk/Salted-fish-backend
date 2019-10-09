package com.salted_fish.fishing.Mapper;

import java.util.List;

import com.salted_fish.fishing.Dto.UserDto;
import com.salted_fish.fishing.Entity.User;
import org.apache.ibatis.annotations.Select;

public interface UserInfoMapper {

    @Select("select * from User_Info where userName = #{userName} and password = #{password}")
    List<User> findByUser(UserDto userDto);
    
}