package ru.newfirefly.exampleproject.controller;

import org.springframework.web.bind.annotation.*;
import ru.newfirefly.exampleproject.model.Developer;

import java.util.List;

@RestController
@RequestMapping("/api/v1/developers")
public class DeveloperRestController {

    @GetMapping
    public List<Developer> getAll(){
        return null;
    }
    @GetMapping("/{id}")
    public Developer getById(@PathVariable Long id){
        return null;
    }

}
