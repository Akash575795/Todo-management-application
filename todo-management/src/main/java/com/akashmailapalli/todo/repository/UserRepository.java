package com.akashmailapalli.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akashmailapalli.todo.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    Boolean existsByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);

    Boolean existsByUsername(String username);
}
