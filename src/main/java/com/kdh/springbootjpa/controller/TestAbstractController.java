package com.kdh.springbootjpa.controller;

import com.kdh.springbootjpa.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public abstract class TestAbstractController {

    protected final TestService testService;

    public String getUserName() {
        return "홍길동";
    }

    public abstract String testAbstractMethod2();

}
