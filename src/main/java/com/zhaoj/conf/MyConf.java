package com.zhaoj.conf;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 作者:zhaoj
 * 创建时间:2020/10/21    20:22
 * 类的作用:
 */
@Configuration
public class MyConf {

    @Bean
    /*@LoadBalanced //负载均衡 如果是集群的话，需要加注解，不是集群的话就不需要添加*/
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
