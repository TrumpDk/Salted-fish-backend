package com.salted_fish.fishing.Service;

import java.util.List;

import com.salted_fish.fishing.Entity.Commodity;

public interface CommodityService {

    public List<Commodity> selectLimitedCommodity(int startIndex, int pageSize);
}