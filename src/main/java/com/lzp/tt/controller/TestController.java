package com.lzp.tt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: lizhipeng
 * @create: 2019-12-09 21:41
 **/
@RestController

public class TestController {
    @RequestMapping(value = "/test")
    public String test(){
        StringBuilder sb = new StringBuilder("hello");
        return sb.toString();
    }
}
