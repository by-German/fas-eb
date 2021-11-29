package com.example.project.controllers;

import com.example.project.entities.Test;
import com.example.project.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/test")
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping
    public List<Test> getAllTest() {
        return testService.getAll();
    }

    @PostMapping
    public Test save(@RequestBody Test test) {
        return testService.save(test);
    }

}
