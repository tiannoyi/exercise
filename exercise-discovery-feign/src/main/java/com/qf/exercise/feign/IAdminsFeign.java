package com.qf.exercise.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("user-server")
public interface IAdminsFeign {

    @GetMapping("/user-server/test/getTest")
    Object getTest();


}
