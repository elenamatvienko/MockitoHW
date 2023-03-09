package me.matvienkoeg.mockitoHW.service.impl;

import me.matvienkoeg.mockitoHW.model.User;
import me.matvienkoeg.mockitoHW.repository.UserDao;
import me.matvienkoeg.mockitoHW.repository.impl.UserDaoImpl;
import me.matvienkoeg.mockitoHW.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Objects;


@Service
public class UserServiceImpl implements UserService {
    private final UserDaoImpl userDao;

    public UserServiceImpl(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean checkUserExist(User user) {
        return Objects.equals(user, userDao.getUserByName(user.getName()));
    }
}








