package com.zzq.zzq_cloud_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ZzqCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZzqCloudConfigApplication.class, args);
	}

}
