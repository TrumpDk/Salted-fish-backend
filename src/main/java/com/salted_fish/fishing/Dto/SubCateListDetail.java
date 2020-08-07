package com.salted_fish.fishing.Dto;

import java.util.List;

import com.salted_fish.fishing.Entity.ItemListForHome;
import com.salted_fish.fishing.Entity.SubCateList;

public class SubCateListDetail {

    private List<SubCateList> subCateLists;

    private List<ItemListForHome> subCateItems;

    public List<SubCateList> getSubCateLists() {
        return subCateLists;
    }

    public List<ItemListForHome> getSubCateItems() {
        return subCateItems;
    }

    public void setSubCateItems(List<ItemListForHome> subCateItems) {
        this.subCateItems = subCateItems;
    }

    public void setSubCateLists(List<SubCateList> subCateLists) {
        this.subCateLists = subCateLists;
    }

    public SubCateListDetail() {
    }

    public SubCateListDetail(List<SubCateList> subCateList, List<ItemListForHome> itemListForHome) {
        this.subCateLists = subCateList;
        this.subCateItems = itemListForHome;
    }
}