package com.salted_fish.fishing.Dto;

public class PageHelperDto {

    private int startIndex;

    private int pageSize;

    public int getStartIndex() {
        return startIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }
}