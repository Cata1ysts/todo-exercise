package com.example.todo.controller;


import com.example.todo.Mapper.TodoMapper;
import com.example.todo.dto.TodoRequest;
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
    @Autowired
    private TodoMapper todoMapper;


    @GetMapping("/")
    public List<Todo> getTodos(@RequestParam(required = false) String title){
        return todoService.getTodoList(title);
    }


    @GetMapping("/{id}")
    public Todo getTodoById(@PathVariable int id){
        return todoService.getTodoById(id);
    }

    @PostMapping("/")
    public Todo addTodo(@RequestBody TodoRequest todoRequest){
        return todoService.newTodo(todoMapper.toEntity(todoRequest));
    }

    @PutMapping("/{id}")
    public Todo updateTodoById(@PathVariable int id,@RequestBody TodoRequest todoRequest){
        return todoService.updateTodoById(id,todoMapper.toEntity(todoRequest));
    }

    @DeleteMapping("/{id}")
    public void deleteTodoById(@PathVariable int id){
         todoService.deleteTodoById(id);
    }
}
