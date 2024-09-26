package com.androidspringbackend.androidspringbackend;

import com.androidspringbackend.androidspringbackend.domain.user.Service.UserDao;
import com.androidspringbackend.androidspringbackend.domain.user.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class AndroidSpringBackendApplicationTests {

    @Autowired
    private UserDao userDao;
    @Test
    void addUserTest() {
        User user = new User();
        user.setUserName("testNAME");
        user.setUserEmail("test@EMAIL.com");
        user.setUserPassword("testPW");
        userDao.saveUser(user);
    }

    @Test
    void getAllUsersAndDeleteThemTests() {
        userDao.getAllUsers().forEach(user -> System.out.println(user.getUserName()));
        List<User> users = userDao.getAllUsers();
        users.forEach(user -> userDao.deleteUser(user));
    }

}
