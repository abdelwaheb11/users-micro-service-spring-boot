package com.abdelwaheb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdelwaheb.entity.Roles;

public interface RoleRepository extends JpaRepository<Roles,Long> {

    Roles findByRole(String r);
}
