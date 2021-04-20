package com.kdh.springbootjpa.controller;

import com.kdh.springbootjpa.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubController extends TestAbstractController {

    public SubController(TestService testService) {
        super(testService);
    }

    @GetMapping("/testMethod3")
    @Override
    public String testAbstractMethod2() {
        this.testService.testMethod2();
        return "SubController testMethod! "+ getUserName();
    }
}
