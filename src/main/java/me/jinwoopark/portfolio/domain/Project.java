package me.jinwoopark.portfolio.domain;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "image", length = 300, nullable = false)
    private String image;

    @Column(name = "result", length = 300, nullable = false)
    private String result;

    @Column(name = "github", length = 300, nullable = false)
    private String github;

    @Column(name = "content", length = 300, nullable = false)
    private String content;

    @CreatedDate
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Builder
    public Project(String title,String image,String result,String github,String content) {
        this.title = title;
        this.image = image;
        this.result = result;
        this.github = github;
        this.content = content;
    }

    public void update(String title,String image,String result,String github,String content) {
        this.title = title;
        this.image = image;
        this.result = result;
        this.github = github;
        this.content = content;
    }




}
