package com.example.laba.controller;

import com.example.laba.model.Task;
import com.example.laba.model.User;
import com.example.laba.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

   
    @PostMapping
    public ResponseEntity<?> createTask(@Valid @RequestBody Task task,
                                        BindingResult bindingResult,
                                        Authentication authentication) {
        if (bindingResult.hasErrors()) {
            String errors = bindingResult.getAllErrors().stream()
                    .map(ObjectError::getDefaultMessage)
                    .collect(Collectors.joining(", "));
            return ResponseEntity.badRequest().body(errors);
        }
      
        User currentUser = (User) authentication.getPrincipal();
        task.setUser(currentUser);
        Task created = taskService.createTask(task);
        return ResponseEntity.ok(created);
    }


    @GetMapping
    public ResponseEntity<List<Task>> getTasks(Authentication authentication) {
        User currentUser = (User) authentication.getPrincipal();
        List<Task> tasks = taskService.getAllTasksForUser(currentUser);
        return ResponseEntity.ok(tasks);
    }
}
