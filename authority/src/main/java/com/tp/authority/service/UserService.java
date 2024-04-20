package com.tp.authority.service;

import com.tp.authority.entities.Role;
import com.tp.authority.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addnewRole (Role role);
    User findUserByUserName(String userName);
    Role findRoleByName(String roleName);
    void addRoleToUser(String username ,String roleName);
    User authenticate(String userName,String password);
}
