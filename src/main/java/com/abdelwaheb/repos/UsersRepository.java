package com.abdelwaheb.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdelwaheb.entity.User;

public interface UsersRepository extends JpaRepository<User , Long> {
    User findByUsername(String u);
    Optional<User> findByEmail(String email);

}
