package com.paynewu.springbootdemo;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="https://paynewu.com">PayneWu</a>
 * @github <a href="https://github.com/0x2cf">payne-wu</a>
 * @date 19:19 2023/1/15
 * @project springboot-demo
 * @description
 */
@SpringBootApplication
@RestController
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

    @RequestMapping("/")
    public String index() {
        return "hello, Springboot";
    }

    @RequestMapping("/hello")
    public Map<String, String> hello() {
        return new HashMap<String, String>(2) {{
            put("hello", "World");
        }};
    }
}
