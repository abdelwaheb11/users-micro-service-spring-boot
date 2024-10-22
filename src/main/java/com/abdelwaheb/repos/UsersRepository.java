package com.abdelwaheb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdelwaheb.entity.User;

public interface UsersRepository extends JpaRepository<User , Long> {
    User findByUsername(String u);

}
