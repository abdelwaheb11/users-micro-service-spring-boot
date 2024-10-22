package com.abdelwaheb.service;





import java.util.List;

import com.abdelwaheb.entity.Roles;
import com.abdelwaheb.entity.User;


public interface UserService {
    public User saveUser(User user);
    public User findUserByUsername (String username);
    public Roles addRole(Roles role);
    public User addRoleToUser(String username, String rolename);
    public List<User> findAllUsers();

}
