package com.stratosphere.strmoonlogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class StrmoonLogsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrmoonLogsApplication.class, args);
	}

}
