package com.example.postofficeapi.feign;

import com.example.postofficeapi.model.PostRequest;
import com.example.postofficeapi.model.PostResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@FeignClient("post-core-api")
public interface PostFeign {
    @GetMapping("/post/check")
    String checkPost();
    @GetMapping("/post/all")
    List<PostResponse> getAllPosts();
    @GetMapping("/post/{postid}")
    PostResponse getPostById(String postid);
    @PostMapping("/post/add")
    PostResponse createPost(PostRequest postRequest);
    @PutMapping("/post/update")
    PostResponse updatePost(PostRequest postRequest);

}
