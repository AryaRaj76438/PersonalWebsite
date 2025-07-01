package com.QuantumSyntax.blogsite.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Lob
    @Column(nullable = false)
    private String content;

    private String technologies;

    private String githubLink;

    private String liveDemo;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    // Getters & Setters

    @PrePersist
    protected void onCreate() {
        createdAt = new Date();
    }

    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public String getTechnologies() { return technologies; }
    public void setTechnologies(String technologies) { this.technologies = technologies; }

    public String getGithubLink() { return githubLink; }
    public void setGithubLink(String githubLink) { this.githubLink = githubLink; }

    public String getLiveDemo() { return liveDemo; }
    public void setLiveDemo(String liveDemo) { this.liveDemo = liveDemo; }
}
