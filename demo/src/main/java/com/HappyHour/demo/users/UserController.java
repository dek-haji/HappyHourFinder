package com.HappyHour.demo.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(path = "api/users")
public class UserController {


    @GetMapping
    public List<User> getUser() {
        ArrayList<User> userList = new ArrayList<User>();
        User user1 =  new User(1, "haj");
        userList.add( user1);
        return  userList;
    }

    @PostMapping(path = "users")
    public void addUser()
    {
    }
}
