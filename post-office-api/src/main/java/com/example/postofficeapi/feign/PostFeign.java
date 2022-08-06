package com.example.postofficeapi.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("post-core-api")
public interface PostFeign {

    @GetMapping("/post/check")
    String checkPost();
}
