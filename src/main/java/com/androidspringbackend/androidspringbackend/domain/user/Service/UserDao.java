package com.androidspringbackend.androidspringbackend.domain.user.Service;
import com.androidspringbackend.androidspringbackend.domain.user.entity.User;
import com.androidspringbackend.androidspringbackend.domain.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDao {

    @Autowired
    private UserRepository repository;

    public void saveUser(User user) {
        repository.save(user);
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(user -> users.add(user));
        return users;
    }

    public void deleteUser(User user) {
        repository.delete(user);
    }
}
