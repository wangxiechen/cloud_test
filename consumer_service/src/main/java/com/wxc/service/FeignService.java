package com.wxc.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "provider-service")
@RequestMapping("/user")
public interface FeignService {
    @RequestMapping("/detail")
    String detail(@RequestParam("id") Integer userid);
}
