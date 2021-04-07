package com.javaRestApi.javaRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication
public class JavaRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaRestApplication.class, args);
	}



}
