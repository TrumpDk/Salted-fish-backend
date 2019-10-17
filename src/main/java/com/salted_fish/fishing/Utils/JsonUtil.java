package com.salted_fish.fishing.Utils;

public class JsonUtil<T> {

    private T data;
    private String code;
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * response with data
     * 
     * @param data
     * @param code
     * @param msg
     */
    public JsonUtil(T data, String code, String msg) {
        this.setData(data);
        this.setMsg(msg);
        this.setCode(code);
    }
    
    /**
     * response without data
     * 
     * @param code
     * @param msg
     */
    public JsonUtil(String code, String msg) {
        this.setCode(code);
        this.setMsg(msg);
        this.setData(null);
    }
}