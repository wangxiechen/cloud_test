package com.wxc.controller;

import com.wxc.service.FeignService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/order")
@RestController
public class FeignController {
    @Resource
    private FeignService feignService;
    
    @RequestMapping("/{id}")
    public String detail(@PathVariable("id") Integer orderid){
        String username = feignService.detail(orderid);
        return "这是"+username+"的订单";
    }
}
