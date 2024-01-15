package com.example.helloworld.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.helloworld.Model.Information;


@Controller
@RequestMapping("/hello")

public class HelloWorldController {
    @GetMapping()
    public ResponseEntity<Object>  ReturnHelloWorld() {
        Information information = new Information();
        information.Data = "Hello World";
        return ResponseEntity.status(HttpStatus.OK).body(information);
    }
}
