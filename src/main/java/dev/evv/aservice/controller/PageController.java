package dev.evv.aservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/v1/page")
public class PageController {

    @GetMapping("/test")
    public String testString(){
        String curIP = "";
        try {
            curIP = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        return "AService test string " + curIP;
    }

    @GetMapping("/test2")
    public String testString2(){
        return "AService string ";
    }

}
