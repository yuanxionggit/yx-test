package com.yx.yxeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class YxEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(YxEurekaApplication.class, args);
	}

}
