package com.salted_fish.fishing.ServiceImpl;

import java.util.List;

import com.salted_fish.fishing.Entity.Commodity;
import com.salted_fish.fishing.Mapper.CommodityMapper;
import com.salted_fish.fishing.Service.CommodityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CommodityService")
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityMapper commodityMapper;

    @Override
    public List<Commodity> selectLimitedCommodity(int startIndex, int pageSize) {
        return commodityMapper.selectLimitedCommodity(startIndex, pageSize);
    }

}