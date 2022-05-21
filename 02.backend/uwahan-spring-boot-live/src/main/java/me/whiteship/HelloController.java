package me.whiteship;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping
    @ResponseBody
    public String hello(){
        return "Spring Boot 개발 툴";
    }
}
