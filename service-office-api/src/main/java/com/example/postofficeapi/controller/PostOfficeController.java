package com.example.postofficeapi.controller;

import com.example.postofficeapi.feign.ClientFeign;
import com.example.postofficeapi.feign.PostFeign;
import com.example.postofficeapi.model.ClientResponse;
import com.example.postofficeapi.model.PostRequest;
import com.example.postofficeapi.model.PostResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/office")
public class PostOfficeController {
    @Autowired
    PostFeign postFeign;
    @Autowired
    ClientFeign clientFeign;
    @GetMapping("/check")
    public String check(){
        return "post-office-api is working!";
    }
    @GetMapping("/authenticated")
    public String pageForAuthenticated(){
        return "secured part of web security";
    }
    @GetMapping("/post/check")
    public String checkPost(){
        return postFeign.checkPost();
    }
    @GetMapping("/post/all")
    public List<PostResponse> getAllPost(){return postFeign.getAllPosts();}
    @GetMapping("/post/{postid}")
    public PostResponse getPostById(@RequestParam("find_myPost") String postid){return postFeign.getPostById(getPostById(postid).getPostid());}
    @GetMapping("/client/check")
    public String checkClient(){return clientFeign.checkClient();}
    @GetMapping("/client/all")
    public List<ClientResponse> getAllClient(){return clientFeign.getAllClient();}
    @GetMapping("/client/{clientId}")
    public ClientResponse getClientById(){
        return clientFeign.getClientById(getClientById().getClientId());
    }

}
