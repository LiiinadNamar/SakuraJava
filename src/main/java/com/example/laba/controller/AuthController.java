package com.example.laba.controller;

import com.example.laba.model.User;
import com.example.laba.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @Autowired
    private UserService userService;

   
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(
            @RequestParam String email,
            @RequestParam String password,
            @RequestParam String firstName,
            @RequestParam String lastName
    ) {
        User user = userService.registerUser(email, password, firstName, lastName);
        return ResponseEntity.ok("User " + user.getEmail() + " registered successfully!");
    }

   
    @PostMapping("/login")
    public ResponseEntity<?> loginUser(
            @RequestParam String email,
            @RequestParam String password
    ) {
        User user = userService.authenticateUser(email, password);
        if (user == null) {
            return ResponseEntity.status(401).body("Invalid email or password");
        }
        return ResponseEntity.ok("Login suces. Hi, " + user.getFirstName() + "!!!!)");
    }
    @GetMapping("/register")
public ResponseEntity<?> getRegisterForm() {
    
    return ResponseEntity.ok("Working, regis comp.");
}

}
