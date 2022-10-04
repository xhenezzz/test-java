package com.demo.PostCoreApi.repository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@EnableJpaRepositories
public interface PostRepository extends CrudRepository<PostEntity, Long> {

    PostEntity getPostEntityByPostid(String postid);

    List<PostEntity> getPostEntityBy();

    @Transactional
    void deletePostEntityPostById(String postid);

}
