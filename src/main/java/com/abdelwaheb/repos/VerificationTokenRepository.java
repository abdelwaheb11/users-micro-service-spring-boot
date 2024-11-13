package com.abdelwaheb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdelwaheb.entity.VerificationToken;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {
    VerificationToken findByToken(String token);
}
