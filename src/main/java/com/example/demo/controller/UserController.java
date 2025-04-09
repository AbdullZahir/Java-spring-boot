package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRespository;


@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRespository _userRespository;

// dependecy injection : https://www.youtube.com/watch?v=D44si7o4ndg&ab_channel=Randomcode
    @Autowired
    public UserController( UserRespository userRespository){
    _userRespository = userRespository;
    };

    //2a
    @PostMapping
    public void creatUser(@RequestBody User user){
        if(user == null){
            new RuntimeException("User is null");
        }
        _userRespository.save(user);
    }


    //2b
    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id){
        Optional<User> user = _userRespository.findById(id);
        if(user==null){ new RuntimeException("User is not found");}
        return user;
    }
    

    //2c
    @GetMapping
    public List<User> getUserByType(@RequestParam(value = "type-filter", required = false) String type){
        if(type == null){
            return _userRespository.findAll(); 

        }
      return  _userRespository.findByType(type);

    }


}
