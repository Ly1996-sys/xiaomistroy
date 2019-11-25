package com.qf.j1906;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableConfigServer //注册配置中心服务
@EnableEurekaClient //将配置中心服务注册到注册中心
@SpringBootApplication
public class XiaomistoryConfigserverApplication {
	public static void main(String[] args) {
		SpringApplication.run(XiaomistoryConfigserverApplication.class, args);
	}
}
