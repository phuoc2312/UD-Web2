package com.example.maihuuphuoc;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HelloWorld {
    @RequestMapping("/")
    public String home() {
        return "Hello, World!";
    }

    @PostMapping("/post")
    public String postMethodName(@RequestBody String requestBody) {

        return requestBody;
    }

    @GetMapping("/get")
    public String getMethodName(@RequestParam String param) {
        return param;
    }

    @PutMapping("put/{id}")
    public String putMethodName(@PathVariable String id, @RequestBody String entity) {

        return entity;
    }

    @DeleteMapping("/delete")
    public String deleteMethodName(@RequestParam String param) {
        return param;
    }

}
