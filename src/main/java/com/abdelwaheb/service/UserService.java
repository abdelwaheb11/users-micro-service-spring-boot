package com.abdelwaheb.service;





import java.util.List;

import com.abdelwaheb.entity.Roles;
import com.abdelwaheb.entity.User;
import com.abdelwaheb.register.RegistationRequest;


public interface UserService {
    public User saveUser(User user);
    public User findUserByUsername (String username);
    public Roles addRole(Roles role);
    public User addRoleToUser(String username, String rolename);
    public List<User> findAllUsers();
    public User registerUser(RegistationRequest request);
    public void sendEmailUser(User u, String code);
    public User validateToken(String code);

}
