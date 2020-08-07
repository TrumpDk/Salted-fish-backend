package com.salted_fish.fishing.Mapper;

import java.util.List;

import com.salted_fish.fishing.Entity.CateList;
import com.salted_fish.fishing.Entity.ItemListForHome;
import com.salted_fish.fishing.Entity.SubCateList;

import org.apache.ibatis.annotations.Select;

public interface CatesMapper {

    @Select("select * from Cate_List")
    public List<CateList> getAllCates();

    @Select("select * from Sub_Cate_List where Cate_Id = #{cateId}")
    public List<SubCateList> getSubCates(int cateId);

    @Select("select Items_Id, Desc_Detail, Img_Src, Item_Spec_Price from Items_List as li"
            + " left join (select * from Item_Img where Item_Id in (select max(Item_Id)"
            + " from Item_Img group by Item_List_Id)) as ii on ii.Item_List_Id = li.Items_Id"
            + " left join (select * from Item_Spec_Price as isp where isp.Item_Spec_Price_Id = "
            + " (select min(Item_Spec_Price_Id) from Item_Spec_Price as b where Item_Spec_Price = "
            + " (select min(Item_Spec_Price) from Item_Spec_Price as a where a.Items_List_Id = b.Items_List_Id)"
            + " and b.Items_List_Id = isp.Items_List_Id)) as aa on aa.Items_List_Id = li.Items_Id where Item_Cate = #{subCateId}")
    public List<ItemListForHome> getItmesList(int subCateId);
}