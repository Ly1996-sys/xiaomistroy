package com.qf.j1906;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringCloudApplication

@ComponentScan(basePackages = {"com.qf.j1906.*"})
public class XiaomistoryGoodApplication {
	public static void main(String[] args) {
		SpringApplication.run(XiaomistoryGoodApplication.class, args);
	}

}
