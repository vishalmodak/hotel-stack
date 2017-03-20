package com.hotel.rating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient
public class HotelRatingServiceApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(HotelRatingServiceApplication.class, args);
    }
}
