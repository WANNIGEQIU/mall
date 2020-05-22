package com.im.mall.common.enums;



public enum  Renum {
    OK(0,"success"),
    ERROR(1,"系统异常，请耐心等待")
    ;

    private int code;
    private String msg;


    Renum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
