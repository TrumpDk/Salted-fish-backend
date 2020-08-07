package com.salted_fish.fishing.Entity;

import java.util.List;

public class CateObjForHome {

    private List<CateList> cateLists;

    private List<SubCateList> subCateLists;

    public List<CateList> getCateLists() {
        return cateLists;
    }

    public List<SubCateList> getSubCateLists() {
        return subCateLists;
    }

    public void setSubCateLists(List<SubCateList> subCateLists) {
        this.subCateLists = subCateLists;
    }

    public void setCateLists(List<CateList> cateLists) {
        this.cateLists = cateLists;
    }

    public CateObjForHome() {
    };

    public CateObjForHome(List<CateList> cateLists, List<SubCateList> subCateLists) {
        this.cateLists = cateLists;
        this.subCateLists = subCateLists;
    }
}