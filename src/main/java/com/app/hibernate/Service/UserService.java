package com.app.hibernate.Service;

import com.app.hibernate.Model.User;
import com.app.hibernate.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    public Iterable<User> getAllUser() {

        return userRepository.findAll();
    }

    public User getUserId(Long id) {

        return userRepository.findById(id).orElse(null);
    }

    public User simpanUser(User user) {
        return userRepository.save(user);
    }

    public void hapusUser(Long id) {
        userRepository.deleteById(id);
    }
}
