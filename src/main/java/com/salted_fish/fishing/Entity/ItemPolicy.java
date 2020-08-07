package com.salted_fish.fishing.Entity;

public class ItemPolicy {

    private int Items_List_Id;

    private int Item_Policy_Id;

    private String Title;

    private String Content;

    public int getItems_List_Id() {
        return Items_List_Id;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        this.Content = content;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public int getItem_Policy_Id() {
        return Item_Policy_Id;
    }

    public void setItem_Policy_Id(int item_Policy_Id) {
        this.Item_Policy_Id = item_Policy_Id;
    }

    public void setItems_List_Id(int items_List_Id) {
        this.Items_List_Id = items_List_Id;
    }

}