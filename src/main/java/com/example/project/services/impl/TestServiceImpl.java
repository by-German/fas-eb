package com.example.project.services.impl;

import com.example.project.entities.Test;
import com.example.project.repositories.TestRepository;
import com.example.project.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestRepository testRepository;

    @Override
    public List<Test> getAll() {
        return testRepository.findAll();
    }

    @Override
    public Test save(Test test) {
        return testRepository.save(test);
    }

}
