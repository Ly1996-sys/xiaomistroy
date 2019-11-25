package com.qf.j1906;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableHystrix
@EnableZuulProxy  //开启Zuul网关服务
@SpringCloudApplication
public class XiaomistroyGatewayApplication {
	public static void main(String[] args) {
		SpringApplication.run(XiaomistroyGatewayApplication.class, args);
	}
}
