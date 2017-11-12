package com.test.constants;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: x
 * Date: 2017-11-12
 * Time: 17:47
 */

public enum  ResultCode {

    SUCCESS(0, "请求成功"),
    WARN(-1, "网络异常，请稍后重试");

    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}