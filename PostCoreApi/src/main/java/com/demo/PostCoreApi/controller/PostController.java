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

    @RequestMapping(path="/add/post", method = RequestMethod.POST)
    @PostMapping
    public PostResponse createPost(@RequestBody PostRequest postRequest){
        return postService.createPost(postRequest);
    }

    @RequestMapping(path="/add/client", method = RequestMethod.POST)
    @PostMapping
    public PostResponse createClient(@RequestBody PostRequest clientRequest){
        return postService.createClient(clientRequest);
    }

    @RequestMapping(path="/update/{postid}", method = RequestMethod.PUT)
    @PutMapping
    public PostResponse updatePostById(@RequestParam String postid, @RequestBody PostRequest postRequest){
        postRequest.setPostid(postid);
        return postService.updatePost(postRequest);
    }

    @RequestMapping(path="/update/{clientid}", method = RequestMethod.PUT)
    @PutMapping
    public PostResponse updateClientById(@RequestParam String postid, @RequestBody PostRequest clientRequest){
        clientRequest.setPostid(postid);
        return postService.updateClient(clientRequest);
    }

    @RequestMapping(path="/{postid}", method = RequestMethod.GET)
    @GetMapping
    public PostResponse getPostById(@RequestParam String postid){
        return postService.getPostById(postid);
    }

    @RequestMapping(path="/{clientid}", method = RequestMethod.GET)
    @GetMapping
    public PostResponse getClientById(@RequestParam String clientid){return postService.getClientById(clientid);}

    @GetMapping("/all/posts")
    public List<PostResponse> getAllPost(){
        return postService.getAllPost();
    }

    @GetMapping("/all/clients")
    public List<PostResponse> getAllClient(){
        return postService.getAllClient();
    }

    @RequestMapping(path="/delete/{postid}", method = RequestMethod.DELETE)
    @DeleteMapping
    public void deletePostById(@RequestParam String postid){
        postService.deletePostById(postid);
    }

    @RequestMapping(path="/delete/{clientid}", method = RequestMethod.DELETE)
    @DeleteMapping
    public void deleteClientById(@RequestParam String clientid){
        postService.deleteClientById(clientid);
    }

}
