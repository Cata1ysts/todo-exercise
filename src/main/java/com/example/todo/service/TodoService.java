package com.example.todo.service;

import com.example.todo.dao.TodoDao;
import com.example.todo.dao.TodoMemory;
import com.example.todo.entity.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private final TodoDao todoDao;
    public TodoService(TodoMemory todoDao){
        this.todoDao=todoDao;
    }

    public List<Todo> getTodoList(String title) {
        return null;
    }

    public Todo getTodoById(int id) {
        return null;
    }

    public Todo newTodo(Todo todo) {
        return null;
    }

    public Todo updateTodoById(int id, Todo todo) {
        return null;
    }

    public void deleteTodoById(int id) {
    }
}
