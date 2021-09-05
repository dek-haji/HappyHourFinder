package com.HappyHour.demo.users;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(path = "api/users")
public class UserController {


    @GetMapping
    public List<User> getUser() {
        ArrayList<User> userList = new ArrayList<User>();
        User user1 =  new User(1, "haj", "dekhaji@emil.com");
        userList.add( user1);
        return  userList;
    }

    @PostMapping(path = "users",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> create(@RequestBody User newUser) {
        User user = userService.save(newUser);
        if (user == null) {
            throw new ServerException();
        } else {
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        }
    }
}
