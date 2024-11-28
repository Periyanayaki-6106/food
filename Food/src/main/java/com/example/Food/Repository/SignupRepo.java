package com.example.Food.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Food.Entity.Signup;

public interface SignupRepo  extends JpaRepository<Signup, Long> {
    Signup findByEmail(String email);
}
