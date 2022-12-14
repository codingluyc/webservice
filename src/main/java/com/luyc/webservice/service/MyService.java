package com.luyc.webservice.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author luyc
 * @since 2022/12/14 17:16
 */
@WebService
public interface MyService{


    @WebMethod
    Response hello(Query query);
}
