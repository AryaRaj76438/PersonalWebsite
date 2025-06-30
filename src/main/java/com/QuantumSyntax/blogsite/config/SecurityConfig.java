package com.QuantumSyntax.blogsite.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails admin = User.withUsername("admin")
                .password("{noop}password") // no encoding needed for testing
                .roles("ADMIN")
                .build();
        return new InMemoryUserDetailsManager(admin);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/", "/about", "/blog", "/css/**", "/js/**", "/images/**").permitAll()
                        .requestMatchers("/blog/new", "/blog/edit/**", "/blog/delete/**").hasRole("ADMIN")
                        .requestMatchers("/projects/new", "/projects/save", "/projects/delete/**").hasRole("ADMIN")
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form.permitAll()) // ✅ default login form
                .logout(logout -> logout
                        .logoutSuccessUrl("/") // ✅ logout redirects to homepage
                        .permitAll()
                );

        return http.build();
    }
}
