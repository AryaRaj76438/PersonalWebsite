package com.QuantumSyntax.blogsite;

import com.QuantumSyntax.blogsite.model.Post;
import com.QuantumSyntax.blogsite.repository.PostRepository;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.QuantumSyntax.blogsite")
public class QuantumSyntaxApplication {

	@Autowired
	private PostRepository postRepository;

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
		System.setProperty("DB_URL", dotenv.get("DB_URL"));
		System.setProperty("DB_USER", dotenv.get("DB_USER"));
		System.setProperty("DB_PASS", dotenv.get("DB_PASS"));
		SpringApplication.run(QuantumSyntaxApplication.class, args);
	}

}
