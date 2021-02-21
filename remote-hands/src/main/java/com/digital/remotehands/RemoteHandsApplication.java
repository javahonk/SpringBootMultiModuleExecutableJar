package com.digital.remotehands;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.digital.remotehands", "com.digital.common.config"})
public class RemoteHandsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RemoteHandsApplication.class, args);
	}

}
