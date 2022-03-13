package com.carepay.assignment.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String content;

    @OneToMany(mappedBy = "post", cascade = {
      CascadeType.ALL
    })
    private List<Comment> commentList;
}
