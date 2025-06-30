package com.QuantumSyntax.blogsite.repository;

import com.QuantumSyntax.blogsite.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findTop3ByOrderByIdDesc();
}
