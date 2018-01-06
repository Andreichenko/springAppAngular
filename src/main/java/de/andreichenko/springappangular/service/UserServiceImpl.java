package de.andreichenko.springappangular.service;


import de.andreichenko.springappangular.model.User;
import de.andreichenko.springappangular.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepositories userRepositories;

    @Override
    public User findById(Long id) {
        return userRepositories.findOne(id);
    }

    @Override
    public User findByName(String name) {
        return userRepositories.findByName(name);
    }

    @Override
    public void saveUser(User user) {
        userRepositories.save(user);

    }

    @Override
    public void updateUser(User user) {
        saveUser(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepositories.delete(id);
    }

    @Override
    public void deleteAllUsers() {
        userRepositories.deleteAll();
    }

    @Override
    public List<User> findAllUser() {
        return userRepositories.findAll();
    }

    @Override
    public boolean isUserExist(User user) {
        return findByName(user.getName())!=null;
    }
}
