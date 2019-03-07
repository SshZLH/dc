package com.d;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import net.dubboclub.catmonitor.DubboCat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Air
 * Date:  2019/3/6
 */
@EnableDubbo
@EnableEurekaClient
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        DubboCat.enable();
        SpringApplication.run(Application.class, args);

    }

}
