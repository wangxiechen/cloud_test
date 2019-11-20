package com.wxc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class ProviderController {

    @RequestMapping("/detail")
    public String detail(@RequestParam("id") Integer userid){
        Map<String, String> map = new HashMap<>();
        map.put("1","小明");
        return map.get(String.valueOf(userid));
    }
}
