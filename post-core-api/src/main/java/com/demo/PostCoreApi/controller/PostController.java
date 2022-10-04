package com.demo.PostCoreApi.controller;

import com.demo.PostCoreApi.model.PostRequest;
import com.demo.PostCoreApi.model.PostResponse;
import com.demo.PostCoreApi.service.post.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    PostService postService;

    @PostMapping("/add")
    public PostResponse createPost(@RequestBody PostRequest postRequest){
        return postService.createPost(postRequest);
    }


    @PutMapping("/update/{postid}")
    public PostResponse updatePostById(@RequestParam String postid, @RequestBody PostRequest postRequest){
        postRequest.setPostid(postid);
        return postService.updatePost(postRequest);
    }
    @GetMapping("/check")
    public String checkPost(){
        return "post-core-api is working";
    }

    @GetMapping("/auth")
    public String PageForAuthenticated(){
        return "you are welcome!";
    }

    @GetMapping("/{postid}")
    public PostResponse getPostById(@RequestParam String postid){
        return postService.getPostById(postid);
    }

    @GetMapping("/all")
    public List<PostResponse> getAllPost(){
        return postService.getAllPost();
    }

    @DeleteMapping("/delete/{postid}")
    public void deletePostById(@RequestParam String postid){
        postService.deletePostById(postid);
    }

}
