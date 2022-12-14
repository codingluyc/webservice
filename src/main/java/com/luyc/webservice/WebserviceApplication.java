package com.luyc.webservice;

import com.luyc.webservice.service.MyServiceImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.ws.Endpoint;

@SpringBootApplication
public class WebserviceApplication {

    public static void main(String[] args) {
//        SpringApplication.run(WebserviceApplication.class, args);
        Endpoint.publish("http://localhost:8080/webservice",new MyServiceImpl());

        //命令行运行：wsimport -encoding utf8 -keep -p com.luyc.webservice.net -Xnocompile http://localhost:8080/webservice?wsdl
        //生成代码

    }

}
