package com.nitinjyoti.springsecuritywithjwt.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

    @RequestMapping({"/hello"})
    public String hello(){
        return "Hello Darshan its working like charm";
    }

    @RequestMapping({"/test"})
    public String test(){
        return "testing the development branch ";
    }
}
