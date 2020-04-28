package com.salted_fish.fishing.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import com.salted_fish.fishing.Entity.Commodity;

public interface CommodityMapper {
    @Select("select * from Items_List order by Create_Time ASC limit #{startIndex}, #{pageSize}")
    public List<Commodity> selectLimitedCommodity(int startIndex, int pageSize);
}