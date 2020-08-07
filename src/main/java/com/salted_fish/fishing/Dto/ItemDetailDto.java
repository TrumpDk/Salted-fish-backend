package com.salted_fish.fishing.Dto;

import java.math.BigDecimal;
import java.util.List;

import com.salted_fish.fishing.Entity.ItemAttr;
import com.salted_fish.fishing.Entity.ItemDetail;
import com.salted_fish.fishing.Entity.ItemImg;
import com.salted_fish.fishing.Entity.ItemPolicy;
import com.salted_fish.fishing.Entity.ItemSpecPrice;

public class ItemDetailDto {

    private int Items_Id;

    private String Desc_Detail;

    private String Item_Detail;

    private String RecommendReason;

    private String Item_Limit;

    private BigDecimal Item_Spec_Price;

    private List<ItemImg> itemImgList;

    private List<ItemAttr> itemAttrList;

    private List<ItemDetail> itemDetailList;

    private List<ItemPolicy> itemPolicyList;

    private List<ItemSpecPrice> itemSpecPriceList;

    public String getDesc_Detail() {
        return Desc_Detail;
    }

    public BigDecimal getItem_Spec_Price() {
		return Item_Spec_Price;
	}

	public void setItem_Spec_Price(BigDecimal item_Spec_Price) {
		this.Item_Spec_Price = item_Spec_Price;
	}

	public int getItems_Id() {
        return Items_Id;
    }

    public void setItems_Id(int items_Id) {
        this.Items_Id = items_Id;
    }

    public List<ItemSpecPrice> getItemSpecPriceList() {
        return itemSpecPriceList;
    }

    public void setItemSpecPriceList(List<ItemSpecPrice> itemSpecPriceList) {
        this.itemSpecPriceList = itemSpecPriceList;
    }

    public List<ItemPolicy> getItemPolicyList() {
        return itemPolicyList;
    }

    public void setItemPolicyList(List<ItemPolicy> itemPolicyList) {
        this.itemPolicyList = itemPolicyList;
    }

    public List<ItemDetail> getItemDetailList() {
        return itemDetailList;
    }

    public void setItemDetailList(List<ItemDetail> itemDetailList) {
        this.itemDetailList = itemDetailList;
    }

    public List<ItemAttr> getItemAttrList() {
        return itemAttrList;
    }

    public void setItemAttrList(List<ItemAttr> itemAttrList) {
        this.itemAttrList = itemAttrList;
    }

    public List<ItemImg> getItemImgList() {
        return itemImgList;
    }

    public void setItemImgList(List<ItemImg> itemImgList) {
        this.itemImgList = itemImgList;
    }

    public String getItem_Limit() {
        return Item_Limit;
    }

    public void setItem_Limit(String item_Limit) {
        this.Item_Limit = item_Limit;
    }

    public String getRecommendReason() {
        return RecommendReason;
    }

    public void setRecommendReason(String recommendReason) {
        this.RecommendReason = recommendReason;
    }

    public String getItem_Detail() {
        return Item_Detail;
    }

    public void setItem_Detail(String item_Detail) {
        this.Item_Detail = item_Detail;
    }

    public void setDesc_Detail(String desc_Detail) {
        this.Desc_Detail = desc_Detail;
    }

    // public ItemDetailDto() {
    // }

    // public ItemDetailDto(int Items_Id, String Desc_Detail, String Item_Detail,
    // String RecommendReason,
    // String Item_Limit, List<ItemImg> itemImgList, List<ItemAttr> itemAttrList,
    // List<ItemDetail> itemDetailList,
    // List<ItemPolicy> itemPolicyList, List<ItemSpecPrice> itemSpecPriceList) {
    // this.Items_Id = Items_Id;
    // this.Desc_Detail = Desc_Detail;
    // this.RecommendReason = RecommendReason;
    // this.Item_Limit = Item_Limit;
    // this.itemImgList = itemImgList;
    // this.itemAttrList = itemAttrList;
    // this.Item_Detail = Item_Detail;
    // this.itemPolicyList = itemPolicyList;
    // this.itemDetailList = itemDetailList;
    // this.itemSpecPriceList = itemSpecPriceList;
    // }
}