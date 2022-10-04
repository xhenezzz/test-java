package com.demo.PostCoreApi.service.post;

import com.demo.PostCoreApi.model.PostRequest;
import com.demo.PostCoreApi.model.PostResponse;

import java.util.List;
public interface PostService {
    PostResponse createPost(PostRequest postRequest);

    PostResponse updatePost(PostRequest postRequest);

    PostResponse getPostById(String postid);

    List<PostResponse> getAllPost();

    void deletePostById(String postid);

}
