package com.example.demo.services;

import com.example.demo.task.Task;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class TaskService {

    private final HashMap<Long, Task> taskMap = new HashMap<>();

    // CREATE
    public void createTask(Task task) {
        taskMap.put(task.getId(), task);
    }

    // READ (by ID)
    public Task getTaskById(Long id) {
        return taskMap.get(id);
    }

    // UPDATE (by ID)
    public void updateTask(Long id, Task task) {
        taskMap.put(id, task);
    }

    // DELETE (by ID)
    public void deleteTask(Long id) {
        taskMap.remove(id);
    }
}
