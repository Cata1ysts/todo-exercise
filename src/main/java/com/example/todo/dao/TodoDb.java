package com.example.todo.dao;



import com.example.todo.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public class TodoDb implements TodoDao{
    JpaTodo jpaTodo;

    public TodoDb(JpaTodo jpaTodo) {
        this.jpaTodo = jpaTodo;
    }


    @Override
    public List<Todo> getTodoLists(String title, String status) {
        if (status != null && title != null) {
            return jpaTodo.findByStatusAndTitle(status, title);
        } else if (status != null) {
            return jpaTodo.findByStatus(status);
        } else if (title != null) {
            return jpaTodo.findByTitleContaining(title);
        } else {
            return jpaTodo.findAll();
        }

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

    @Override
    public List<Todo> getByPage(PageRequest pageRequest) {
        return jpaTodo.findAll(pageRequest).toList();
    }
}
