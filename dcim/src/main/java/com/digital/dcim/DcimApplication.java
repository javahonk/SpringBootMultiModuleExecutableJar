package com.digital.dcim;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.digital.dcim", "com.digital.common.config"})
public class DcimApplication {

	public static void main(String[] args) {
		SpringApplication.run(DcimApplication.class, args);
	}

}
