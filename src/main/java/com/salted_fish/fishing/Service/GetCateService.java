package com.salted_fish.fishing.Service;

import java.util.List;

import com.salted_fish.fishing.Dto.SubCateListDetail;
import com.salted_fish.fishing.Entity.CateList;
import com.salted_fish.fishing.Entity.SubCateList;

public interface GetCateService {

    public List<CateList> getAllCates();

    public List<SubCateList> getSubcateLists(int cateId);

    public SubCateListDetail getSubCateListDetail(int cateId, int subCateId);
}