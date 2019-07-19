package com.chaoqun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "test")
public class TestController {

    @GetMapping(value = "check.do", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String test() {
        return "ok-赞";
    }

}
