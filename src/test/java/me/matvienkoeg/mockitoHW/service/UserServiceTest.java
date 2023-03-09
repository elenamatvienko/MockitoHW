package me.matvienkoeg.mockitoHW.service;

import me.matvienkoeg.mockitoHW.model.User;
import me.matvienkoeg.mockitoHW.repository.UserDao;
import me.matvienkoeg.mockitoHW.repository.impl.UserDaoImpl;
import me.matvienkoeg.mockitoHW.service.impl.UserServiceImpl;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static jdk.internal.org.jline.utils.InfoCmp.Capability.user2;
import static me.matvienkoeg.mockitoHW.constants.Constants.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    private UserDaoImpl userDaoMock = new UserDaoImpl();

    @InjectMocks
    private UserServiceImpl out;


    @Test
    public void shouldCheckUserExist() {
        User user2 = new User("User2");
        when(userDaoMock.getUserByName("User2")).thenReturn(user2);

        Assertions.assertTrue(out.checkUserExist(user2));
    }

        @Test
        public void shouldCheckUserExist1() {

        User user4 = new User("User4");
        when(userDaoMock.getUserByName("User4")).thenReturn(null);

        Assertions.assertFalse(out.checkUserExist(user4));
    }


}



