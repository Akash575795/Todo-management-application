package com.akashmailapalli.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akashmailapalli.todo.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
