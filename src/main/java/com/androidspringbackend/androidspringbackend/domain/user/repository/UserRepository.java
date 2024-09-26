package com.androidspringbackend.androidspringbackend.domain.user.repository;

import com.androidspringbackend.androidspringbackend.domain.user.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
