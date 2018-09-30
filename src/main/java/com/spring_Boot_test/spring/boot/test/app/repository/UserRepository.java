package com.spring_Boot_test.spring.boot.test.app.repository;

import com.spring_Boot_test.spring.boot.test.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}

