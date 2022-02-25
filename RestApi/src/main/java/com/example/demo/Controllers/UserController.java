package com.example.demo.Controllers;

import com.example.demo.Models.User;
import com.example.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService service;
    @RequestMapping("/")
    public String welcome() {
        return "Welcome to RestTemplate Example.";
    }

    /*get all*/
    @GetMapping(value = "/User")
    public List<User> listUser() {
        return service.findAll();
    }


    @GetMapping(value = "/User/{id}")
    public Optional<User> AfficherUser(@PathVariable("id") Long id) {
        return service.findById(id);

    }

    @PostMapping(value = "/User")
    public void add(@RequestBody User user) {
        service.save(user);
    }


    @PutMapping(value = "/User/update/{id}")
    public void updateUser(@RequestBody User user, @PathVariable("id") Long id) {
        user.setId(id);
        service.save(user);
    }
    @RequestMapping(value = "/User/delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public boolean delete (@PathVariable("id") Long id){
        service.deleteById(id);
        return true;
    }
}
