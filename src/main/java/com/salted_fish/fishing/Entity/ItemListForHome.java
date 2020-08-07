package com.salted_fish.fishing.Entity;

public class ItemListForHome {

    private int Items_Id;

    private String Desc_Detail;

    private String Img_Src;

    private String Item_Spec_Price;

    public int getItems_Id() {
        return Items_Id;
    }

    public String getItem_Spec_Price() {
        return Item_Spec_Price;
    }

    public void setItem_Spec_Price(String item_Spec_Price) {
        this.Item_Spec_Price = item_Spec_Price;
    }

    public String getImg_Src() {
        return Img_Src;
    }

    public void setImg_Src(String img_Src) {
        this.Img_Src = img_Src;
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