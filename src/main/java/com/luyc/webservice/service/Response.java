package com.luyc.webservice.service;

/**
 * @author luyc
 * @since 2022/12/14 18:16
 */
public class Response {
    private Integer code;
    private Data data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
