package com.demo.PostCoreApi.service.post;

import com.demo.PostCoreApi.model.PostRequest;
import com.demo.PostCoreApi.model.PostResponse;
import com.demo.PostCoreApi.repository.PostEntity;
import com.demo.PostCoreApi.repository.PostRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepository postRepository;

    static ModelMapper modelMapper = new ModelMapper();

    static {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }

    @Override
    public PostResponse createPost(PostRequest postRequest) {
        postRequest.setPostid(UUID.randomUUID().toString());
        PostEntity postEntity = modelMapper.map(postRequest, PostEntity.class);
        postRepository.save(postEntity);
        return modelMapper.map(postEntity, PostResponse.class);
    }

    @Override
    public PostResponse updatePost(PostRequest postRequest) {
        PostEntity postEntity = modelMapper.map(postRequest, PostEntity.class);
        PostEntity dbEntity = postRepository.getPostEntityByPostid(postRequest.getPostid());
        postEntity.setId(dbEntity.getId());
        postRepository.save(postEntity);
        return modelMapper.map(postEntity, PostResponse.class);
    }

    @Override
    public PostResponse getPostById(String postid) {
        PostEntity postEntity = postRepository.getPostEntityByPostid(postid);
        return modelMapper.map(postEntity, PostResponse.class);
    }

    @Override
    public List<PostResponse> getAllPost() {
        return postRepository.getPostEntityBy().stream()
                .map(post -> modelMapper.map(post, PostResponse.class))
                .collect(Collectors.toList());
    }

    @Override
    public void deletePostById(String postid) {
        postRepository.deletePostEntityPostById(postid);
    }
}
