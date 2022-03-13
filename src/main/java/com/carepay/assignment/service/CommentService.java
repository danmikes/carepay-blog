package com.carepay.assignment.service;

import com.carepay.assignment.domain.CommentDetails;
import com.carepay.assignment.domain.CommentInfo;
import com.carepay.assignment.domain.CreateCommentRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.validation.Valid;

public interface CommentService {
  CommentDetails createComment(@Valid CreateCommentRequest createCommentRequest);

  Page<CommentInfo> getComments(final Pageable pageable);

  CommentDetails getCommentDetails(Long id);

  void deleteComment(Long id);
}
