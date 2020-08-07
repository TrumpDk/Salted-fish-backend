package com.salted_fish.fishing.Service;

import java.util.List;

import com.salted_fish.fishing.Entity.Commodity;
import com.salted_fish.fishing.Entity.ItemListForHome;

public interface CommodityService {

    public List<Commodity> selectLimitedCommodity(int startIndex, int pageSize);

    public List<ItemListForHome> selectGoodsForHome();
}