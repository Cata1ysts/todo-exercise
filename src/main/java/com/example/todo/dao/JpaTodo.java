package com.example.todo.dao;


import com.example.todo.entity.Todo;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTodo extends JpaRepository<Todo, Integer> {

}