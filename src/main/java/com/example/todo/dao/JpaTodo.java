package com.example.todo.dao;


import com.example.todo.entity.Todo;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaTodo extends JpaRepository<Todo, Integer> {
    List<Todo> findByStatus(String status);
    List<Todo> findByTitleContaining(String title);

    List<Todo> findByStatusAndTitle(String status, String title);
}