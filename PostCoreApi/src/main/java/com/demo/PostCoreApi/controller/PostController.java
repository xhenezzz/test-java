package com.demo.PostCoreApi.controller;

import com.demo.PostCoreApi.model.PostModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.demo.PostCoreApi.service.PostService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/")
public class PostController {
    @Autowired
    private PostService postService;
    @GetMapping("/check")
    public ResponseEntity<String> checkPost(){
        try{
            return ResponseEntity.ok("Сервер работает");
        } catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PostMapping
    public ResponseEntity<String> createPost (@Valid @RequestBody PostModel postModel){
        postService.createPost(postModel);
        return new ResponseEntity<String>("Successful created", HttpStatus.OK);
    }

    @GetMapping("/all")
    public List<PostModel> getAllPosts(){
        return postService.getAllPosts();
    }

    @GetMapping("/{postid}")
    public PostModel getPostById(@PathVariable String postid){
        return postService.getPostById(postid);
    }

    @PutMapping("/{postid}")
    public ResponseEntity<String>  updatePostById(@PathVariable String postid, @Valid @RequestBody PostModel postModel){
        postService.updatePostById(postid, postModel);
        return new ResponseEntity<String>("Successful updated", HttpStatus.OK);
    }

    @DeleteMapping("/{postid}")
    public ResponseEntity<String> deletePostById(@PathVariable String postid){
        postService.deletePostById(postid);
        return new ResponseEntity<String>("Successful deleted", HttpStatus.OK);
    }
}
