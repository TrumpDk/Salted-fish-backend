package com.salted_fish.fishing.Mapper;

import java.util.List;

import com.salted_fish.fishing.Entity.ItemDetail;

import org.apache.ibatis.annotations.Select;

public interface ItemDetaiMapper {

    @Select("select * from Item_Detail where Item_List_Id = #{itemId}")
    public List<ItemDetail> getItemDetaiByItemId(int itemId);

}