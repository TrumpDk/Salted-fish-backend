package com.salted_fish.fishing.ServiceImpl;

import java.util.List;

import com.salted_fish.fishing.Dto.SubCateListDetail;
import com.salted_fish.fishing.Entity.CateList;
import com.salted_fish.fishing.Entity.ItemListForHome;
import com.salted_fish.fishing.Entity.SubCateList;
import com.salted_fish.fishing.Mapper.CatesMapper;
import com.salted_fish.fishing.Service.GetCateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("GetCateService")
public class GetCateServiceImpl implements GetCateService {

    @Autowired
    private CatesMapper catesMapper;

    @Override
    public List<CateList> getAllCates() {
        return catesMapper.getAllCates();
    }

    @Override
    public List<SubCateList> getSubcateLists(int cateId) {
        return catesMapper.getSubCates(cateId);
    }

    @Override
    public SubCateListDetail getSubCateListDetail(int cateId, int subCateId) {
        List<SubCateList> subCateList = catesMapper.getSubCates(cateId);
        List<ItemListForHome> itemListForHome = catesMapper.getItmesList(subCateId);
        SubCateListDetail scList = new SubCateListDetail(subCateList, itemListForHome);
        return scList;
    }

}