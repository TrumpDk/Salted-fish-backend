package com.salted_fish.fishing.Entity;

import java.util.Date;

public class Commodity {

    private int Items_Id;

    private String Desc_Detail;

    private int Price;

    private int Creator;

    private Date Create_Time;

    private String Img_Src;

    public int getItems_Id() {
        return Items_Id;
    }

    public String getImg_Src() {
        return Img_Src;
    }

    public void setImg_Src(String img_Src) {
        this.Img_Src = img_Src;
    }

    public Date getCreate_Time() {
        return Create_Time;
    }

    public void setCreate_Time(Date create_Time) {
        this.Create_Time = create_Time;
    }

    public int getCreator() {
        return Creator;
    }

    public void setCreator(int creator) {
        this.Creator = creator;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        this.Price = price;
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