package com.example.todo.service;

import com.example.todo.dao.TodoDao;
import com.example.todo.dao.TodoDb;
import com.example.todo.dao.TodoMemory;
import com.example.todo.entity.Todo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private final TodoDao todoDao;
    public TodoService(TodoDb todoDao){
        this.todoDao=todoDao;
    }

    public List<Todo> getTodoList(String title) {
        return todoDao.getTodoLists(title);
    }

    public Todo getTodoById(int id) {
        return todoDao.getTodoById(id);
    }
    @Transactional
    public Todo newTodo(Todo todo) {
        todo.setId(null);
        return todoDao.save(todo);
    }

    public Todo updateTodoById(int id, Todo todo) {
        Todo todoById = todoDao.getTodoById(id);
        if(todoById==null) throw new IllegalArgumentException("Todo index invalid !");
        todo.setId(id);
        return todoDao.save(todo);
    }

    public void deleteTodoById(int id) {
        Todo todoById = todoDao.getTodoById(id);
        if(todoById==null) throw new IllegalArgumentException("Todo index invalid !");
        todoDao.deleteTodoById(id);
    }
}
