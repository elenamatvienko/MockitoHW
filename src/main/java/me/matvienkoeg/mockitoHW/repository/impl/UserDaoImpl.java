package me.matvienkoeg.mockitoHW.repository.impl;

import me.matvienkoeg.mockitoHW.model.User;
import me.matvienkoeg.mockitoHW.repository.UserDao;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserDaoImpl implements UserDao {

    private final List<User> users = new ArrayList<>();

    public UserDaoImpl() {
        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");
        users.add(user1);
        users.add(user2);
        users.add(user3);
    }


    @Override
    public User getUserByName(String userName) {
        for (User user : users)
            if (user.getName().equals(userName)) {
                return user;
            }
        return null;
    }


    @Override
    public List<User> findAllUsers() {

        return users;
    }
}
