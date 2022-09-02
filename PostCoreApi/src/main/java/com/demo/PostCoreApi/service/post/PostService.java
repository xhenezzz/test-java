package com.demo.PostCoreApi.service.post;

import com.demo.PostCoreApi.model.PostRequest;
import com.demo.PostCoreApi.model.PostResponse;

import java.util.List;
public interface PostService {
    PostResponse createPost(PostRequest postRequest);

    PostResponse createClient(PostRequest clientRequest);

    PostResponse updatePost(PostRequest postRequest);

    PostResponse updateClient(PostRequest clientRequest);

    PostResponse getPostById(String postid);

    PostResponse getClientById(String clientid);

    List<PostResponse> getAllPost();

    List<PostResponse> getAllClient();

    void deletePostById(String postid);

    void deleteClientById(String clientid);

}
