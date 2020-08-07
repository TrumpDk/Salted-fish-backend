package com.salted_fish.fishing.Entity;

import java.math.BigDecimal;

public class HomeGoods {
    private int Items_Id;

    private String Desc_Detail;

    private BigDecimal Item_Spec_Price;

    public int getItems_Id() {
        return Items_Id;
    }

    public BigDecimal getItem_Spec_Price() {
        return Item_Spec_Price;
    }

    public void setItem_Spec_Price(BigDecimal item_Spec_Price) {
        this.Item_Spec_Price = item_Spec_Price;
    }

    public String getDesc_Detail() {
        return Desc_Detail;
    }

    public void setDesc_Detail(String desc_Detail) {
        this.Desc_Detail = desc_Detail;
    }

    public void setItems_Id(int items_Id) {
        this.Items_Id = items_Id;
    }
}