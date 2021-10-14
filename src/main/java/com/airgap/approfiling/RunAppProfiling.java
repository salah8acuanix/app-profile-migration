package com.airgap.approfiling;

/*
 * Copyright (c) Acuanix Systems Co. is the owner of this artifact.
 * @Author: Sayed Taha Nov 2020
 */

//import com.airgap.approfiling.config.AppConfig;
//import com.airgap.approfiling.config.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableScheduling
@EnableEurekaClient
@EnableFeignClients
@RefreshScope
@EnableCaching

//@Import(AppConfig.class)
public class RunAppProfiling {

    public static void main(String[] args) {
        System.setProperty("server.servlet.context-path", "/approfile");
        SpringApplication.run(RunAppProfiling.class, args);
    }
    @RestController
    class EntryController {
        @RequestMapping(value = "/checkAvailability")
        public ResponseEntity<String> hello() {
            return ResponseEntity.ok("App profile service is working ");
        }
    }
}

