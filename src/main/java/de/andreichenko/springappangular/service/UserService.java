package de.andreichenko.springappangular.service;

import de.andreichenko.springappangular.model.User;

import java.util.List;

public interface UserService {

    User findById(Long id);

    User findByName(String name);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(Long id);

    void deleteAllUsers();

    List<User> findAllUser();

    boolean isUserExist(User user);

}
