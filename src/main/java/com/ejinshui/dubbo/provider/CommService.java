package com.ejinshui.dubbo.provider;


import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "${spring.application.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}")
public class CommService implements  CommonServiceI{

    @Override
    public String getToker(String in) {

        return "success";
    }
}
