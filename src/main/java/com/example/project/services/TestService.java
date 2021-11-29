package com.example.project.services;

import com.example.project.entities.Test;

import java.util.List;

public interface TestService {
    List<Test> getAll();
    Test save(Test test);
}
