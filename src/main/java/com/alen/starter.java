package com.alen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class starter {

	public static void main(String[] args) {
		  SpringApplication springApplication = new SpringApplication(starter.class);
		  //启动啊
	        springApplication.run(args);
	}



}
