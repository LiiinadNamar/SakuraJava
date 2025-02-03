// package com.example.laba.service;

// import com.example.laba.model.Task;
// import com.example.laba.model.User;
// import com.example.laba.repository.UserRepository;
// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
// import static org.junit.jupiter.api.Assertions.*;

// @SpringBootTest
// public class TaskServiceTest {

//     @Autowired
//     private TaskService taskService;

//     @Autowired
//     private UserRepository userRepository;

//     @Test
//     void testCreateTask() {
//         User user = new User();
//         user.setEmail("task@test.com");
//         user.setPassword("12345");
//         userRepository.save(user);

        
//         Task task = new Task();
//         task.setTitle("New Task");
//         task.setUser(user);

//         Task savedTask = taskService.createTask(task);
//         assertNotNull(savedTask.getId(), "ID generated");
//         assertEquals("New Task", savedTask.getTitle());
//         assertEquals(user.getId(), savedTask.getUser().getId());
//     }
// }

