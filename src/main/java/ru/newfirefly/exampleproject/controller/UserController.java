package ru.newfirefly.exampleproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.newfirefly.exampleproject.model.User;
import ru.newfirefly.exampleproject.service.UserService;

import javax.jws.WebParam;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/users")
    public String findAll(Model model){
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/create")
    public String createUserForm(User user){
        return "create";
    }

    @PostMapping("/create")
    public String createUser(User user){
        userService.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("delete/{id}")
    public String deleteById(@PathVariable("id") Integer id){
        userService.delete(id);
        return "redirect:/users";
    }

    @GetMapping("/update/{id}")
    public String updateForm(@PathVariable("id") Integer id, Model model){
        User user = userService.findById(id);
        model.addAttribute(user);

        return "update";
    }

    @PostMapping("/update")
    public String update(User user){
        userService.saveUser(user);
        return "redirect:/users";
    }


}
