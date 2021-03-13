package com.kdh.springbootjpa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JpaController {

    @RequestMapping("/first")
    @ResponseBody
    public String first() {
        return "Hello Wolrd!";
    }
}
