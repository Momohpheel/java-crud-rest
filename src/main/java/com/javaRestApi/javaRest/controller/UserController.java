package com.javaRestApi.javaRest.controller;


import com.javaRestApi.javaRest.models.User;
import com.javaRestApi.javaRest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/name")
    public String name(){
        return "Philip";
    }

    //getAll
    @GetMapping("/users")
    public List<User> getAll(){
        return userService.getAll();
    }

//    //getOnebyId
//    @GetMapping("/user/{id}")
//    public User get(@PathVariable("id") Integer id){
//        User user = userService.get(id);
//        return user;
//
//
//    }
    //register
    @PostMapping("/register")
    public ResponseEntity<Map<String, String>> register(@RequestBody User user) {
        try {
            userService.register(user);
            Map<String, String> map = new HashMap();
            map.put("message", "User created Successfully");
            return new ResponseEntity<>(map, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.UNAUTHORIZED);
        }
    }
//
//    //login
//    @PostMapping("/login")
//    public ResponseEntity<Map<String, String>> login() {
//
//    }
//
//
    //updatebyId
    @PutMapping("/user/{id}")
    public ResponseEntity<Map<String, Object>> update(@PathVariable("id") Integer id, @RequestBody User user){
        User object = userService.update(id, user);
        Map<String, Object> map = new HashMap<>();
        map.put("data", object);
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
//    //deleteById
//    @DeleteMapping("/user/{id}")
//    public ResponseEntity<Map<String, String>> delete(){
//
//    }
}
