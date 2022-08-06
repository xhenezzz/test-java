package com.example.postofficeapi.controller;

import com.example.postofficeapi.feign.PostFeign;
import com.example.postofficeapi.model.PostModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    @GetMapping("/post/allPost")
    public List<PostModel> getAllPost(){
        return postFeign.getAllPosts();
    }
    @GetMapping("/post/allClient")
    public List<PostModel> getAllClient(){
        return postFeign.getAllClient();
    }

    @GetMapping("/post/{postid}")
    public PostModel getPostById(){
        return postFeign.getPostById(getPostById().getPostid());
    }
}
