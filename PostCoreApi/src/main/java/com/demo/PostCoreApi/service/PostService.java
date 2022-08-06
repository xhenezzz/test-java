package com.demo.PostCoreApi.service;

import com.demo.PostCoreApi.model.PostModel;

import java.util.List;

public interface PostService {
    void createPost(PostModel postModel);
    List<PostModel> getAllPosts();
    List<PostModel> getAllClient();
    PostModel getPostById(String postid);
    PostModel getClientById(String clientdid);
    void updatePostById(String postid, PostModel postModel);
    void deletePostById(String postid);
}
