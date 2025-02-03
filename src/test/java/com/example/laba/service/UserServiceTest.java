// package com.example.laba.service;

// import com.example.laba.model.User;
// //import com.example.laba.repository.UserRepository;
// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
// import static org.junit.jupiter.api.Assertions.*;

// @SpringBootTest
// public class UserServiceTest {

//     @Autowired
//     private UserService userService;
    
//    // @Autowired
//   //  private UserRepository userRepository;

//     @Test
//     void testRegisterUser() {
//         User user = userService.registerUser("test@example.com", "secret123", "Liinad", "Namar");
//         assertNotNull(user.getId(), "User ID gen");
//         assertNotEquals("secret123", user.getPassword(), "pass enc");
//     }

//     @Test
//     void testAuthenticateUser() {
//         userService.registerUser("auth@example.com", "mypass", "Anna", "Anna");
//         User authUser = userService.authenticateUser("auth@example.com", "mypassword");
//         assertNotNull(authUser, "Auth suces");
//         User wrongUser = userService.authenticateUser("auth@example.com", "wrongpass");
//         assertNull(wrongUser, "Auth null");
//     }
// }

