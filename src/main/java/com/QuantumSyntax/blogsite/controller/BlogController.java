package com.QuantumSyntax.blogsite.controller;

import com.QuantumSyntax.blogsite.model.Post;
import com.QuantumSyntax.blogsite.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; // ✅ Missing annotation
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BlogController {

    @Autowired
    private PostRepository postRepository;

    // ✅ This was missing
    @GetMapping("/blog")
    public String blogList(Model model) {
        List<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "blog";
    }

    @GetMapping("/blog/new")
    public String newBlogForm(Model model) {
        model.addAttribute("post", new Post());
        return "new_blog";
    }

    @PostMapping("/blog/save")
    public String saveBlog(@ModelAttribute("post") Post post) {
        postRepository.save(post);
        return "redirect:/blog";
    }

    @GetMapping("/blog/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        Post post = postRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid blog ID"));
        model.addAttribute("post", post);
        return "new_blog"; // Reuse the same form
    }

    @GetMapping("/blog/delete/{id}")
    public String deleteBlog(@PathVariable Long id) {
        postRepository.deleteById(id);
        return "redirect:/blog";
    }


    @GetMapping("/blog/view/{id}")
    public String viewBlog(@PathVariable Long id, Model model) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Blog not found"));

        List<Post> recentPosts = postRepository.findTop3ByOrderByIdDesc();
        model.addAttribute("post", post);
        model.addAttribute("recentPosts", recentPosts);

        return "blog_detail";
    }


}
