package com.example.demo.repository;

import com.example.demo.entity.Todo;
import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
