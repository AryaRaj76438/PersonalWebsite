package com.QuantumSyntax.blogsite.model;

import jakarta.persistence.*;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length = 1000)
    private String description;

    private String technologies;

    private String githubLink;

    private String liveDemo;

    public Project() {}

    // Getters and Setters manually written
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public String getTechnologies() { return technologies; }

    public void setTechnologies(String technologies) { this.technologies = technologies; }

    public String getGithubLink() { return githubLink; }

    public void setGithubLink(String githubLink) { this.githubLink = githubLink; }

    public String getLiveDemo() { return liveDemo; }

    public void setLiveDemo(String liveDemo) { this.liveDemo = liveDemo; }
}
