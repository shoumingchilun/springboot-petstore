package com.example.springbootpetstore.utils;

/**
 * @Classname AjaxResult
 * @Description ajax json 返回数据
 * @Date 2019/6/25 10:21
 * @Created by WDD
 */
public class AjaxResult {
    private boolean success;
    private String message;
    private String imgUrl;
    private String type;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getImgUrl() {
        return imgUrl;
    }


    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
