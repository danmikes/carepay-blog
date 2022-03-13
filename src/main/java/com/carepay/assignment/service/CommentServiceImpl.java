package com.carepay.assignment.service;

import com.carepay.assignment.domain.CommentDetails;
import com.carepay.assignment.domain.CommentInfo;
import com.carepay.assignment.domain.CreateCommentRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class CommentServiceImpl implements CommentService {
  @Override
  public CommentDetails createComment(@Valid CreateCommentRequest createCommentRequest) {
    return createComment(createCommentRequest);
  }

  @Override
  public Page<CommentInfo> getComments(Pageable pageable) {
    return getComments(pageable);
  }

  @Override
  public CommentDetails getCommentDetails(Long id) {
    return getCommentDetails(id);
  }

  @Override
  public void deleteComment(Long id) {
    deleteComment(id);
  }
}
