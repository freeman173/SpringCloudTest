package com.jc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


//启动类
@SpringBootApplication
//开启服务注册功能
@EnableEurekaClient
//开启服务发现功能
@EnableDiscoveryClient
public class DeptProvider8081_config {

    public static void main(String[] jc){
        SpringApplication.run(DeptProvider8081_config.class,jc);
    }




}