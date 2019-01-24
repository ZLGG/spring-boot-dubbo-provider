package com.alibaba.edas.boot;

import com.alibaba.dubbo.config.annotation.Service;

@Service(group = "zlg", version = "0.0.1")
public class IHelloServiceImpl implements IHelloService{
    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "(from Dubbo with Spring Boot)";
    }
}
