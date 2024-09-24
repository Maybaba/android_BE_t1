package com.androidspringbackend.androidspringbackend.domain.user.controller;

import com.androidspringbackend.androidspringbackend.domain.user.Service.UserDao;
import com.androidspringbackend.androidspringbackend.domain.user.entity.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserDao dao;

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return dao.getAllUsers();
    }

    @PostMapping("/save")
    public User save(@RequestBody User user) {
       return dao.save(user);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody User user) {
        dao.deleteUser(user);
    }
}
