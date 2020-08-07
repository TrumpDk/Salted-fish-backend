package com.salted_fish.fishing.Entity;

public class ItemDetail {

    private int Item_Id;

    private int Item_List_Id;

    private String Item_Spec;

    private String Iten_Img;

    private String Item_value;

    private int type;

    public int getItem_Id() {
        return Item_Id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getItem_value() {
        return Item_value;
    }

    public void setItem_value(String item_value) {
        this.Item_value = item_value;
    }

    public String getIten_Img() {
        return Iten_Img;
    }

    public void setIten_Img(String iten_Img) {
        this.Iten_Img = iten_Img;
    }

    public String getItem_Spec() {
        return Item_Spec;
    }

    public void setItem_Spec(String item_Spec) {
        this.Item_Spec = item_Spec;
    }

    public int getItem_List_Id() {
        return Item_List_Id;
    }

    public void setItem_List_Id(int item_List_Id) {
        this.Item_List_Id = item_List_Id;
    }

    public void setItem_Id(int item_Id) {
        this.Item_Id = item_Id;
    }
}