package me.matvienkoeg.mockitoHW.repository;


import me.matvienkoeg.mockitoHW.model.User;

import java.util.Collection;
import java.util.List;

public interface UserDao {
    User getUserByName (String userName);
    List<User> findAllUsers();

}
