package com.example.todo.dao;


import com.example.todo.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoDb implements TodoDao{
    JpaTodo jpaTodo;

    public TodoDb(JpaTodo jpaTodo) {
        this.jpaTodo = jpaTodo;
    }


    @Override
    public List<Todo> getTodoLists(String title) {
        if(title==null)return jpaTodo.findAll();
        return jpaTodo.findByTitleContaining(title);

    }

    @Override
    public Todo getTodoById(int id) {
        return jpaTodo.findById(id).orElse(null);
    }

    @Override
    public Todo save(Todo todo) {
        return jpaTodo.save(todo);
    }

    @Override
    public Todo updateTodoById(Todo todo) {
       return jpaTodo.save(todo);
    }

    @Override
    public void deleteTodoById(int id) {
        jpaTodo.deleteById(id);
    }
}
