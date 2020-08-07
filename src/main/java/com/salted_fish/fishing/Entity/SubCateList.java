package com.salted_fish.fishing.Entity;

public class SubCateList {

    private int Sub_Cate_Id;

    private int Cate_Id;

    private String SubCate_Title;

    private String SubCate_Img;

    public int getSub_Cate_Id() {
        return Sub_Cate_Id;
    }

    public String getSubCate_Img() {
        return SubCate_Img;
    }

    public void setSubCate_Img(String subCate_Img) {
        this.SubCate_Img = subCate_Img;
    }

    public String getSubCate_Title() {
        return SubCate_Title;
    }

    public void setSubCate_Title(String subCate_Title) {
        this.SubCate_Title = subCate_Title;
    }

    public int getCate_Id() {
        return Cate_Id;
    }

    public void setCate_Id(int cate_Id) {
        this.Cate_Id = cate_Id;
    }

    public void setSub_Cate_Id(int sub_Cate_Id) {
        this.Sub_Cate_Id = sub_Cate_Id;
    }
}