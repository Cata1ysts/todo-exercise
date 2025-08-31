package com.example.todo.dao;


import com.example.todo.entity.Todo;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface TodoDao {
    public List<Todo> getTodoLists(String title, String status);
    public Todo getTodoById(int id);
    public Todo save(Todo todo);
    public Todo updateTodoById(Todo todo);
    public void deleteTodoById(int id);

    List<Todo> getByPage(PageRequest pageRequest);
}
