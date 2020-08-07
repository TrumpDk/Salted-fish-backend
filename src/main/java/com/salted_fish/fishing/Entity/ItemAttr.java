package com.salted_fish.fishing.Entity;

public class ItemAttr {

    private int Item_List_Id;

    private int Item_Attr_Id;

    private String Attr_Value;

    private String Attr_Name;

    public int getItem_List_Id() {
        return Item_List_Id;
    }

    public String getAttr_Name() {
        return Attr_Name;
    }

    public void setAttr_Name(String attr_Name) {
        this.Attr_Name = attr_Name;
    }

    public String getAttr_Value() {
        return Attr_Value;
    }

    public void setAttr_Value(String attr_Value) {
        this.Attr_Value = attr_Value;
    }

    public int getItem_Attr_Id() {
        return Item_Attr_Id;
    }

    public void setItem_Attr_Id(int item_Attr_Id) {
        this.Item_Attr_Id = item_Attr_Id;
    }

    public void setItem_List_Id(int item_List_Id) {
        this.Item_List_Id = item_List_Id;
    }
}