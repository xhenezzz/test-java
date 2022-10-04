package com.demo.PostCoreApi.service.deprecated;

import com.demo.PostCoreApi.model.PostModel;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PostServiceImplOld implements PostServiceOld {
    protected static final HashMap<String, PostModel> postMap = new HashMap();

    static {
        PostModel postModel1 = new PostModel(UUID.randomUUID().toString(), UUID.randomUUID().toString(), "Mouse", "on the way");
        PostModel postModel2 = new PostModel(UUID.randomUUID().toString(), UUID.randomUUID().toString(), "Laptop", "on unloading");
        postMap.put(postModel1.getPostid(), postModel1);
        postMap.put(postModel2.getPostid(), postModel2);
    }
    public void createPost(PostModel postModel) {
        postModel.setPostid(UUID.randomUUID().toString());
        postModel.setPostRecipientId(UUID.randomUUID().toString());
        postMap.putIfAbsent(postModel.getPostid(), postModel);
    }

    @Override
    public List<PostModel> getAllPosts() {
        return new ArrayList<>(postMap.values());
    }

    @Override
    public List<PostModel> getAllClient() {return new ArrayList<>(postMap.values());
    }

    @Override
    public PostModel getPostById(String postid) {
        return postMap.get(postid);
    }

    @Override
    public PostModel getClientById(String clientdid) {return postMap.get(clientdid);
    }

    @Override
    public void updatePostById(String postid, PostModel postModel) {
        postModel.setPostid(postid);
        postMap.put(postid, postModel);
    }

    @Override
    public void deletePostById(String postid) {
        postMap.remove(postid);
    }
}
