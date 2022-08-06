package com.example.postofficeapi.controller;

import com.example.postofficeapi.feign.PostFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("office")
public class PostOfficeController {
    @Autowired
    PostFeign postFeign;

    @GetMapping("/check")
    public String check(){
        return "post-office-api is working!";
    }

    @GetMapping("/post/check")
    public String checkPost(){
        return postFeign.checkPost();
    }
}
