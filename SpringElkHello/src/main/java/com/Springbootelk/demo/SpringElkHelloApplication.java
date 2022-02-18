package com.Springbootelk.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
@SpringBootApplication
@RestController
public class SpringElkHelloApplication {
     
    private static Log log = LogFactory.getLog(SpringElkHelloApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(SpringElkHelloApplication.class, args);
    }
    @GetMapping("/test")
    public String testELK() {
        log.info("Inside test ELK!!");
        return "Hello!!";
    }
}
