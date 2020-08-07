package com.salted_fish.fishing.Entity;

import java.math.BigDecimal;

public class ItemSpecPrice {

    private int Items_List_Id;

    private int Item_Spec_Price_Id;

    private String Item_Spec_Ids;

    private BigDecimal Item_Spec_Price;

    public int getItems_List_Id() {
        return Items_List_Id;
    }

    public BigDecimal getItem_Spec_Price() {
        return Item_Spec_Price;
    }

    public void setItem_Spec_Price(BigDecimal item_Spec_Price) {
        this.Item_Spec_Price = item_Spec_Price;
    }

    public String getItem_Spec_Ids() {
        return Item_Spec_Ids;
    }

    public void setItem_Spec_Ids(String item_Spec_Ids) {
        this.Item_Spec_Ids = item_Spec_Ids;
    }

    public int getItem_Spec_Price_Id() {
        return Item_Spec_Price_Id;
    }

    public void setItem_Spec_Price_Id(int item_Spec_Price_Id) {
        this.Item_Spec_Price_Id = item_Spec_Price_Id;
    }

    public void setItems_List_Id(int items_List_Id) {
        this.Items_List_Id = items_List_Id;
    }
}