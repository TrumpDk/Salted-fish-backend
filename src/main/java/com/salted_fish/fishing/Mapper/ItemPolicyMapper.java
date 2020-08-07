package com.salted_fish.fishing.Mapper;

import com.salted_fish.fishing.Entity.ItemPolicy;

import org.apache.ibatis.annotations.Select;

public interface ItemPolicyMapper {

    @Select("select * from Item_Policy where Items_List_Id = #{itemId}")
    public ItemPolicy getItemPolicyByItemId(int itemId);

}