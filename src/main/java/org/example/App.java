package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableEurekaServer
@EnableScheduling
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class , args ) ;
    }

    @Scheduled(cron = "0 10 14 * * *")
    public void test() {
        System.out.println("hello ..............");
    }

}
