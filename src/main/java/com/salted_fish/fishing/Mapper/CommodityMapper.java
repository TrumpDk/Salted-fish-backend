package com.salted_fish.fishing.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import com.salted_fish.fishing.Entity.Commodity;
import com.salted_fish.fishing.Entity.HomeGoods;
import com.salted_fish.fishing.Entity.ItemListForHome;

public interface CommodityMapper {
        @Select("select * from Items_List order by Create_Time DESC limit #{startIndex}, #{pageSize}")
        public List<Commodity> selectLimitedCommodity(int startIndex, int pageSize);

        @Select("SELECT Items_Id, Desc_Detail, Item_Spec_Price from Items_List left join Item_Spec_Price on Items_Id = Items_List_Id where Item_Spec_Price_Id in "
                        + "(select max(Item_Spec_Price_Id) from Items_List right JOIN Item_Spec_Price on Items_Id = Items_List_Id GROUP by Items_List_Id) LIMIT 0, 100")
        public List<HomeGoods> selectGoodsForHomr();

        // @Select("select * from Items_List limit 0, 60")
        // @Results(id = "itemListForHomeMap", value = { @Result(id = true, column =
        // "Items_Id", property = "Items_Id"),
        // @Result(column = "Desc_Detail", property = "Desc_Detail"),
        // @Result(column = "Create_Time", property = "Create_Time"),
        // @Result(column = "Item_Detail", property = "Item_Detail"),
        // @Result(column = "Item_Cate", property = "Item_Cate"),
        // @Result(column = "Item_Limit", property = "Item_Limit"),
        // @Result(column = "Items_Id", property = "itemImg", one = @One(select =
        // "com.salted_fish.fishing.Mapper.ItemImgMapper.getItemImgByItemListId",
        // fetchType = FetchType.EAGER)),
        // @Result(column = "Items_Id", property = "itemSpecPrice", one = @One(select =
        // "com.salted_fish.fishing.Mapper.ItemSpecPriceMapper.getItemSpecPriceByItemListId",
        // fetchType = FetchType.EAGER)) })
        // public List<ItemListForHome> queryDataForHomrPage();

        @Select("select Items_Id, Desc_Detail, Img_Src, Item_Spec_Price from Items_List as li"
                        + " left join (select * from Item_Img where Item_Id in (select max(Item_Id)"
                        + " from Item_Img group by Item_List_Id)) as ii on ii.Item_List_Id = li.Items_Id"
                        + " left join (select * from Item_Spec_Price as isp where isp.Item_Spec_Price_Id = "
                        + " (select min(Item_Spec_Price_Id) from Item_Spec_Price as b where Item_Spec_Price = "
                        + " (select min(Item_Spec_Price) from Item_Spec_Price as a where a.Items_List_Id = b.Items_List_Id)"
                        + " and b.Items_List_Id = isp.Items_List_Id)) as aa on aa.Items_List_Id = li.Items_Id limit 0, 60")
        public List<ItemListForHome> queryDataForHomrPage();
}