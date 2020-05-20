package com.inhwan.example.web;

import com.inhwan.example.web.dto.HelloResponseDto;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloResponseDto(@RequestParam("name") String name,
                                             @RequestParam("amount") int amount){
        return new HelloResponseDto(name, amount);
    }

    //@GetMapping("/") -> 머스테치랑 중복
    @GetMapping("//")
    public String index(){
        return "Hello World!";
    }
}
