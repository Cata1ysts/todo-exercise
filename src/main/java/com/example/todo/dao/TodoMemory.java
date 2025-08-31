package com.example.todo.dao;

import com.example.todo.entity.Todo;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class TodoMemory implements TodoDao{
    private final Map<Integer,Todo> todotable;

    public TodoMemory(Map<Integer, Todo> todotable) {
        this.todotable = todotable;
    }

    @Override
    public List<Todo> getTodoLists() {
        return List.of();
    }

    @Override
    public List<Todo> getTodoLists(String title) {
        return List.of();
    }

    @Override
    public Todo getTodoById(int id) {
        return null;
    }

    @Override
    public Todo newTodo(Todo todo) {
        return null;
    }

    @Override
    public Todo updateTodoById(int id, Todo todo) {
        return null;
    }

    @Override
    public void deleteTodoById(int id) {

    }
}
