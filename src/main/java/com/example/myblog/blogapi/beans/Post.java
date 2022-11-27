package com.example.myblog.blogapi.beans;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;


@Getter
@Setter
@Entity
@Table
public class Post {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @NotNull
    @Column
    private String title;

    @Lob
    @Column
    @NotNull
    private String content;

    @Column
    private Instant createdOn;

    @Column
    private Instant updatedOn;

    @Column
    @NotNull
    private String username;





}
