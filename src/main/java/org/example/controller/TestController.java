package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/hello")
    public  String      testHello()
    {
        return "hello jenkins" ;
    }

    @GetMapping("/hello2")
    public  String      testHello2()
    {
        return "hello jenkins 3333" ;
    }

}
