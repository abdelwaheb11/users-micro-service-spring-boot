package com.abdelwaheb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.abdelwaheb.entity.Roles;
import com.abdelwaheb.entity.User;
import com.abdelwaheb.repos.RoleRepository;
import com.abdelwaheb.repos.UsersRepository;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    public User saveUser(User user){
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return this.usersRepository.save(user);
    }

    @Override
    public User findUserByUsername (String username){
        return this.usersRepository.findByUsername(username);
    }
    @Override
    public Roles addRole(Roles role){
        return this.roleRepository.save(role);
    }
    @Override
    public User addRoleToUser(String username, String rolename){
        User user = this.usersRepository.findByUsername(username);
        Roles role = this.roleRepository.findByRole(rolename);
        user.getRoles().add(role);
        this.usersRepository.save(user);
        return user;
    }

    @Override
    public List<User> findAllUsers() {
        return this.usersRepository.findAll();
    }


    
}
