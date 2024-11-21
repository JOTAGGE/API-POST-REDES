package demo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Olá, Spring Boot";
    }

    @GetMapping("/clientIdBody")
    public String getMethodName(@RequestParam String cli) {
        return "ResPosta: " + cli;
    }
    
    
}
