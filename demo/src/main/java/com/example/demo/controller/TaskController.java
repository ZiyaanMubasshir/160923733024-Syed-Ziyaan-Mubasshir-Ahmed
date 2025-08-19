package com.example.demo.controller;

import com.example.demo.task.Task;
import com.example.demo.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    // CREATE (POST)
    @PostMapping("/create")
    public String create(@RequestBody Task task) {
        taskService.createTask(task);
        return "Task is successfully created";
    }

    // READ (GET)
    @GetMapping("/{id}")
    public Task get(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    // UPDATE (PUT)
    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id, @RequestBody Task task) {
        taskService.updateTask(id, task);
        return "Task is successfully updated";
    }

    // DELETE (DELETE)
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "Task is successfully deleted";
    }
}
