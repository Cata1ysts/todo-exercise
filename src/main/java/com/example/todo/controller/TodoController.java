package com.example.todo.controller;


import com.example.todo.entity.Todo;
import com.example.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    @Autowired
    private TodoService todoService;


    @GetMapping("")
    public List<Todo> getTodosByTitle(@RequestParam String title){
        return todoService.getTodoList(title);
    }

    @GetMapping("")
    public List<Todo> getTodos(){
        return todoService.getTodoList();
    }

    @GetMapping("/{id}")
    public Todo getTodos(@PathVariable int id){
        return todoService.getTodoById(id);
    }

    @PostMapping("")
    public Todo getTodos(@RequestBody Todo todo){
        return todoService.newTodo(todo);
    }

    @PutMapping("/{id}")
    public Todo updateTodoById(@PathVariable int id,@RequestBody Todo todo){
        return todoService.updateTodoById(id,todo);
    }

    @DeleteMapping("/{id}")
    public void deleteTodoById(@PathVariable int id){
         todoService.deleteTodoById(id);
    }
}
