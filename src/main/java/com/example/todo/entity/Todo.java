package com.example.todo.entity;

import jakarta.persistence.Entity;

@Entity
public class Todo {
    private Integer id;
    private String title;
    private String status;

    public Todo() {

    }

    public Todo(Integer id, String titles, String status) {
        this.status = status;
        this.id = id;
        this.title = titles;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String titles) {
        this.title = titles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
