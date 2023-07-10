package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api") //localhost:8080
public class DemoController {

    @GetMapping("test")             //localhost:8080/api/test
    public String testEndpoint(@RequestParam String name) {
        return "hello world " +name;
    }
                            //localhost:8080/api/test2
    @GetMapping("test2")
    public DemoType testEndpoint2() {
        return new DemoType("test",123);
    }
    @PostMapping("test3")
    public String  testEndpoint3(@RequestBody DemoType input) {
        return input.getField1();
    }


}
