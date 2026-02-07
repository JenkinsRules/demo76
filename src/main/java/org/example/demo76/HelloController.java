package org.example.demo76;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
        @GetMapping("/hello")
        public String sayHello() {
            return "Hello Frederik, world! Your Spring Boot controller is working.";
        }

}
