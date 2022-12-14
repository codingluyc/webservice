package com.luyc.webservice;

import com.luyc.webservice.net.*;

/**
 * @author luyc
 * @since 2022/12/14 17:46
 */
public class Client {
    public static void main(String[] args) {
        //1.创建一个webservice的客户端
        MyServiceImplService implService = new MyServiceImplService();
        MyServiceImpl my = implService.getMyServiceImplPort();
        Query query = new Query();
        query.setStr("text");
        query.setNum(100);
        Response response =  my.hello(query);
        System.out.println("response:"+response.toString());
    }
}
