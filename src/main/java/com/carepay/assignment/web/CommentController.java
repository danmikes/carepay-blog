package com.carepay.assignment.web;

import com.carepay.assignment.domain.CommentDetails;
import com.carepay.assignment.domain.CommentInfo;
import com.carepay.assignment.domain.CreateCommentRequest;
import com.carepay.assignment.service.CommentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "posts/{id}/comments", produces = MediaType.APPLICATION_JSON_VALUE)
public class CommentController {
  private final CommentService commentService;

  public CommentController(CommentService commentService) {
    this.commentService = commentService;
  }

  @GetMapping
  Page<CommentInfo> getComments(Pageable pageable) {
    return commentService.getComments(pageable);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  CommentDetails createComment(@Valid @RequestBody CreateCommentRequest createCommentRequest) {
    return commentService.createComment(createCommentRequest);
  }

  @GetMapping("{id}")
  CommentDetails getCommentDetails(@PathVariable("id") final Long id) {
    return commentService.getCommentDetails(id);
  }

  @DeleteMapping("{id}")
  @ResponseStatus(HttpStatus.OK)
  void deleteComment(@PathVariable("id") final Long id) {
    commentService.deleteComment(id);
  }
}
