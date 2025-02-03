package com.example.laba.service;

import com.example.laba.model.Task;
import com.example.laba.model.User;
import com.example.laba.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public List<Task> getAllTasksForUser(User user) {
        return taskRepository.findByUserId(user.getId());
    }

    public Task updateTask(Long taskId, String newTitle, String newDescription) {
        Task task = getTaskById(taskId);
        if (task != null) {
            task.setTitle(newTitle);
            task.setDescription(newDescription);
            return taskRepository.save(task);
        }
        return null;
    }

    public void deleteTask(Long taskId) {
        taskRepository.deleteById(taskId);
    }
}
