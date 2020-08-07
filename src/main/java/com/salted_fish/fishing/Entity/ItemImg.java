package com.salted_fish.fishing.Entity;

public class ItemImg {

    private int Item_id;

    private int Item_list_Id;

    private String Img_Src;

    public int getItem_id() {
        return Item_id;
    }

    public String getImg_Src() {
        return Img_Src;
    }

    public void setImg_Src(String img_Src) {
        this.Img_Src = img_Src;
    }

    public int getItem_list_Id() {
        return Item_list_Id;
    }

    public void setItem_list_Id(int item_list_Id) {
        this.Item_list_Id = item_list_Id;
    }

    public void setItem_id(int item_id) {
        this.Item_id = item_id;
    }

}