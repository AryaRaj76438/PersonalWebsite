package com.QuantumSyntax.blogsite;

import com.QuantumSyntax.blogsite.model.Post;
import com.QuantumSyntax.blogsite.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.QuantumSyntax.blogsite")
public class QuantumSyntaxApplication {

	@Autowired
	private PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(QuantumSyntaxApplication.class, args);
	}

}
