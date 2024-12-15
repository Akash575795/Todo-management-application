package com.akashmailapalli.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akashmailapalli.todo.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
