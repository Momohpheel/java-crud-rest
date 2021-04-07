package com.javaRestApi.javaRest.services;

import com.javaRestApi.javaRest.models.User;
import com.javaRestApi.javaRest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

@Service
@Transactional
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAll() {
        List<User> allUsers = userRepository.findAll();
        return allUsers;

    }



//
    public User register(User user) {
        User reg = new User();
        Pattern pattern = Pattern.compile("^(.+)@(.+)$");
        reg.setEmail(user.getEmail());
        reg.setPassword(user.getPassword());
        reg.setUsername(user.getUsername());
        return userRepository.save(reg);


    }

//    public User login(User user) {
//        //
//    }
//
    public User update(Integer id, User user) {
        User person = userRepository.getOne(id);
        person.setEmail(user.getEmail());
        person.setUsername(user.getUsername());
        person.setPassword(user.getPassword());
        //return person.save(person);
        return user;

    }
//
//    public User delete() {
//    }
}
