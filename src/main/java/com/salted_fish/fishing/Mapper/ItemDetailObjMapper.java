package com.salted_fish.fishing.Mapper;

import com.salted_fish.fishing.Dto.ItemDetailDto;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

public interface ItemDetailObjMapper {

    @Select("select Items_Id, Desc_Detail, Item_Detail, RecommendReason, Item_Limit, Item_Spec_Price from Items_List li"
            + " left join (select * from Item_Spec_Price as isp where isp.Item_Spec_Price_Id ="
            + " (select min(Item_Spec_Price_Id) from Item_Spec_Price as b where Item_Spec_Price ="
            + " (select min(Item_Spec_Price) from Item_Spec_Price as a where a.Items_List_Id = "
            + " b.Items_List_Id) and b.Items_List_Id = isp.Items_List_Id)) as aa on aa.Items_List_Id = "
            + " li.Items_Id where Items_Id = #{Items_Id}")
    @Results(id = "ItemDetailDtoMap", value = { @Result(id = true, column = "Items_Id", property = "Items_Id"),
            @Result(column = "Desc_Detail", property = "Desc_Detail"),
            @Result(column = "Item_Detail", property = "Item_Detail"),
            @Result(column = "RecommendReason", property = "RecommendReason"),
            @Result(column = "Item_Limit", property = "Item_Limit"),
            @Result(column = "Items_Id", property = "itemImgList", one = @One(select = "com.salted_fish.fishing.Mapper.ItemImgMapper.getItemImgsByItemListId", fetchType = FetchType.EAGER)),
            @Result(column = "Items_Id", property = "itemAttrList", one = @One(select = "com.salted_fish.fishing.Mapper.ItemAttrMapper.getAttrByItemId", fetchType = FetchType.EAGER)),
            @Result(column = "Items_Id", property = "itemDetailList", one = @One(select = "com.salted_fish.fishing.Mapper.ItemDetaiMapper.getItemDetaiByItemId", fetchType = FetchType.EAGER)),
            @Result(column = "Items_Id", property = "itemPolicyList", one = @One(select = "com.salted_fish.fishing.Mapper.ItemPolicyMapper.getItemPolicyByItemId", fetchType = FetchType.EAGER)),
            @Result(column = "Items_Id", property = "itemSpecPriceList", one = @One(select = "com.salted_fish.fishing.Mapper.ItemSpecPriceMapper.getItemSpecPricesByItemListId", fetchType = FetchType.EAGER)) })
    public ItemDetailDto getItemDetailByItemId(int itemId);

}