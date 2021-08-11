package com.alt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@ComponentScan(value = {"com.alt"})
@EnableEurekaClient
@EnableMongoAuditing
public class ProductApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ProductApp.class);
    }
}
