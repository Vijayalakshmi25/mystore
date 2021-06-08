package com.training.mystore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping(value="/info")
        public String getMessage(){
            return "Welcome to spring boot learning";
        }
    }

