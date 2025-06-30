package com.QuantumSyntax.blogsite.repository;

import com.QuantumSyntax.blogsite.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findTop3ByOrderByIdDesc();
}