package com.salted_fish.fishing.Mapper;

import java.util.List;

import com.salted_fish.fishing.Entity.ItemImg;

import org.apache.ibatis.annotations.Select;

public interface ItemImgMapper {

    @Select("select * from Item_Img where Item_List_Id = #{itemListId}")
    public List<ItemImg> getItemImgsByItemListId(int itemListId);
}