package com.salted_fish.fishing.Mapper;

import com.salted_fish.fishing.Entity.ItemAttr;

import org.apache.ibatis.annotations.Select;

public interface ItemAttrMapper {

    @Select("select * from Item_Attr where Item_List_Id=#{itemId}")
    public ItemAttr getAttrByItemId(int itemId);

}