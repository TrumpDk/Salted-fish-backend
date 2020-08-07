package com.salted_fish.fishing.Mapper;

import java.util.List;

import com.salted_fish.fishing.Entity.ItemSpecPrice;

import org.apache.ibatis.annotations.Select;

public interface ItemSpecPriceMapper {

    @Select("select * from Item_Spec_Price where Items_List_Id = #{itemListId}")
    public List<ItemSpecPrice> getItemSpecPricesByItemListId(int itemListId);
}