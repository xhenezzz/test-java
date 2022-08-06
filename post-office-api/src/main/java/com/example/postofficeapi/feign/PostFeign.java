package com.example.postofficeapi.feign;

import com.example.postofficeapi.model.PostModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("post-core-api")
public interface PostFeign {
    @GetMapping("/post/check")
    String checkPost();
    @GetMapping("post/allPost")
    List<PostModel> getAllPosts();
    @GetMapping("post/allClient")
    List<PostModel> getAllClient();
    @GetMapping("post/{postid}")
    PostModel getPostById(String postid);
}
