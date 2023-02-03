package com.example.jpa.jpapractise.service;

import com.example.jpa.jpapractise.model.User;

import java.util.List;

public interface UserService {
   public List<User> getAll();
   public User addUser(User user);

   public User updateUser(User user);

   public String deleteUser(Long id);
}
