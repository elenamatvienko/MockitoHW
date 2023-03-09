package me.matvienkoeg.mockitoHW.repository;

import me.matvienkoeg.mockitoHW.model.User;
import me.matvienkoeg.mockitoHW.repository.impl.UserDaoImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static me.matvienkoeg.mockitoHW.constants.Constants.*;

public class UserDaoTest {
    UserDaoImpl userDao = new UserDaoImpl();
    @Test
    public void shouldUserExists() {

        Assertions.assertNotNull(userDao.getUserByName(USER_NAME_1));
        Assertions.assertEquals("User1", USER_NAME_1);

    }
    @Test
    public void shouldUserNoExists() {

        Assertions.assertNull(userDao.getUserByName(NO_USER));

    }
}
