package com.kdh.springbootjpa.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{
    @Override
    public void testMethod() {
        System.out.println(">>> Service Method Call!");
    }

    @Override
    public void testMethod2() {
        System.out.println(">>> Service Method Call! 222222222222222");
    }
}
