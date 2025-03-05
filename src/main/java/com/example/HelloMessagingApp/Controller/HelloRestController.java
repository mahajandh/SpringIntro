package com.example.HelloMessagingApp.Controller;

import com.example.HelloMessagingApp.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {
    @RequestMapping("/")
    public String index(){
        return "Hello from BridgeLabz";
    }

    @GetMapping("/hello/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    @GetMapping("/hello/param/{name}")
    public String sayHelloWithPathVariable(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    @PostMapping("/post")
    public String sayHello(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

}