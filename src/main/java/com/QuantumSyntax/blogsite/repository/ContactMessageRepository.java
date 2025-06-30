package com.QuantumSyntax.blogsite.repository;

import com.QuantumSyntax.blogsite.model.ContactMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {
}