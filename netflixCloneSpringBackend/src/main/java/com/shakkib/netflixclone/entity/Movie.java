package com.shakkib.netflixclone.entity;

import org.checkerframework.checker.signature.qual.Identifier;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Movie {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;
    private String title;
    private String outLine;
    private String imageUrl;
    private String plot;
    private String casting;
    private String director;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime openAt;
    private LocalDateTime releasedAt;
    private Released Active;

    @ManyToOne
    @JoinColumn(name = "genre_seq")
    private Genre genre;
}
