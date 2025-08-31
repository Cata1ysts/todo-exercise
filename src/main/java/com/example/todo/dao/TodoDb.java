package com.example.todo.dao;


import com.example.todo.entity.Todo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoDb implements TodoDao{
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
