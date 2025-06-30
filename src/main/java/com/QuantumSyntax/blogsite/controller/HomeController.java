package com.QuantumSyntax.blogsite.controller;

import com.QuantumSyntax.blogsite.model.Project;
import com.QuantumSyntax.blogsite.repository.PostRepository;
import com.QuantumSyntax.blogsite.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private PostRepository postRepository;

    @GetMapping("/")
    public String home(Model model) {
        List<Project> featuredProjects = projectRepository.findTop3ByOrderByIdDesc(); // 👈 next step
        model.addAttribute("projects", featuredProjects);
        model.addAttribute("recentPosts", postRepository.findTop3ByOrderByIdDesc());
        return "home";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
