package org.hsmak.jpa.service;

import org.hsmak.jpa.entity.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers();
}
