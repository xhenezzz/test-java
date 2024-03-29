package com.demo.PostCoreApi.controller;

import com.demo.PostCoreApi.model.PostModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.demo.PostCoreApi.service.deprecated.PostServiceOld;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/deprecated/post")
public class PostControllerOld {
    @Autowired
    Environment env;

    @Autowired
    private PostServiceOld postService;
    @GetMapping("/check")
    public ResponseEntity<String> checkPost(){
        try{
            return ResponseEntity.ok("Сервер работает на порте: " + env.getProperty("local.server.port"));
        } catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PostMapping
    public ResponseEntity<String> createPost (@Valid @RequestBody PostModel postModel){
        postService.createPost(postModel);
        return new ResponseEntity<String>("Successful created", HttpStatus.OK);
    }

    @GetMapping("/deprecated/allPost")
    public List<PostModel> getAllPosts(){
        return postService.getAllPosts();
    }

    @GetMapping("/{postid}")
    public PostModel getPostById(@PathVariable String postid){
        return postService.getPostById(postid);
    }

    @GetMapping("/{clientid}")
    public PostModel getClientById(@PathVariable String clientid){ return postService.getClientById(clientid);}
    @GetMapping("/allPost")
    public List<PostModel> getAllClient(){return postService.getAllClient();}

    @PutMapping("/updateAOld/{postid}")
    public ResponseEntity<String>  updatePostById(@PathVariable String postid, @Valid @RequestBody PostModel postModel){
        postService.updatePostById(postid, postModel);
        return new ResponseEntity<String>("Successful updated", HttpStatus.OK);
    }

    @DeleteMapping("/deleteOld/{postid}")
    public ResponseEntity<String> deletePostById(@PathVariable String postid){
        postService.deletePostById(postid);
        return new ResponseEntity<String>("Successful deleted", HttpStatus.OK);
    }
}
