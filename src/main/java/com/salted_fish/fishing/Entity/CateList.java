package com.salted_fish.fishing.Entity;

public class CateList {

    private int Cate_Id;

    private String Cate_Title;

    private String Background_Img;

    public int getCate_Id() {
        return Cate_Id;
    }

    public String getBackground_Img() {
        return Background_Img;
    }

    public void setBackground_Img(String background_Img) {
        this.Background_Img = background_Img;
    }

    public String getCate_Title() {
        return Cate_Title;
    }

    public void setCate_Title(String cate_Title) {
        this.Cate_Title = cate_Title;
    }

    public void setCate_Id(int cate_Id) {
        this.Cate_Id = cate_Id;
    }
}