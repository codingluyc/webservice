package com.luyc.webservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author luyc
 * @since 2022/12/14 17:14
 */
@WebService
public class MyServiceImpl implements MyService{
    public static final Logger log = LoggerFactory.getLogger(MyServiceImpl.class);


    @WebMethod
    @Override
    public Response hello(Query query){
        log.info("str:{},num:{}",query.getStr(),query.getNum());
        Response response = new Response();
        Data data = new Data();
        data.setMsg("hello world");
        response.setCode(200);
        response.setData(data);
        return response;
    }
}
