package com.carepay.assignment.service;

import javax.validation.Valid;

import com.carepay.assignment.domain.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    @Override
    public PostDetails createPost(@Valid CreatePostRequest createPostRequest) {
        return createPost(createPostRequest);
    }

    @Override
    public Page<PostInfo> getPosts(Pageable pageable) {
        return getPosts(pageable);
    }

    @Override
    public PostDetails getPostDetails(Long id) {
        return getPostDetails(id);
    }

    @Override
    public void deletePost(Long id) {
        deletePost(id);
    }
}
