package com.d.client;

import com.alibaba.dubbo.config.annotation.Reference;
import com.d.server.AsdService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Air
 * Date:  2019/3/6
 */
@RestController
public class AsdController {
    @Value("${server.port}")
    private int port;

    @Reference(version = "1.0.0")
    private AsdService asdService;

    @RequestMapping("hello")
    public String say() {
        System.out.println(asdService);
        return "节点1：Hello World! (server port + " + port + "). + dubbo后端调用+"+asdService.sayHello();
    }

    @RequestMapping("h")
    public String say1() {
        return "hellos";
    }
}
