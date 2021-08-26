package com.project.eurekaserver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaServer
@SpringBootApplication
public class HrEurekaServerApplication {

    public static void main(String[] args){
        SpringApplication.run(HrEurekaServerApplication.class, args);
    }

}
