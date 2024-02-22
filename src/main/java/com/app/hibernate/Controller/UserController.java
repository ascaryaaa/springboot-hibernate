package com.app.hibernate.Controller;

import com.app.hibernate.Model.User;
import com.app.hibernate.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public Iterable<User> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserId(id);
    }

    @PostMapping
    public User simpanUser(@RequestBody User user) {
        System.out.println(user);
        return  userService.simpanUser(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return userService.simpanUser(user);
    }

    @DeleteMapping("/{id}")
    public void hapusUser(@PathVariable Long id) {
        userService.hapusUser(id);
    }

}
