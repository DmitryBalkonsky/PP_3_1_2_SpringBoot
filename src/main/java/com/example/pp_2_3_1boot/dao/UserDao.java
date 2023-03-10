package com.example.pp_2_3_1boot.dao;

import com.example.pp_2_3_1boot.model.User;

import java.util.List;


public interface UserDao {
    public List<User> getAllUsers();

    public User getUserById(long id);

    public void saveUser(User user);

    void updateUser(User updatedUser);

    public void deleteUser(long id);
}