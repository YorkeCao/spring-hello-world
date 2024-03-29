package dev.yorkecao.demo.springhelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringHelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringHelloWorldApplication.class, args);
    }

    @GetMapping("/greeting")
    public String greeting() {
        return "hello world";
    }
}
