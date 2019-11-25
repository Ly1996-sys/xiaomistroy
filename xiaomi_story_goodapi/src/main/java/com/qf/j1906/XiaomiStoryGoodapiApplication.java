package com.qf.j1906;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class XiaomiStoryGoodapiApplication {
	public static void main(String[] args) {
		SpringApplication.run(XiaomiStoryGoodapiApplication.class, args);
	}
}
