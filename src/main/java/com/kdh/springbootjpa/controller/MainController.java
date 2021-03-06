package com.kdh.springbootjpa.controller;

import com.kdh.springbootjpa.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController extends TestAbstractController {

    public MainController(TestService testService) {
        super(testService);
    }

    @GetMapping("/testMethod2")
    @Override
    public String testAbstractMethod2() {
        this.testService.testMethod2();
        return "MainController testMethod! " + getUserName();
    }
}
