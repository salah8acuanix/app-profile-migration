/*
 * Copyright (c) Afaq Systems Co. is the owner of this artifact.
 * @Author: Sayed Taha March 2020
 */

package com.airgap.approfiling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootTomcatApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTomcatApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(SpringBootTomcatApplication.class);
	}
	@RequestMapping(value="/approfile/")
	public String initApp() {
		return "Welcome to backup manager app APIs...";
	}
	
}