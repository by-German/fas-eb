package com.example.project.controllers;

import com.example.project.entities.ExamRoom;
import com.example.project.services.ExamRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/exam-rooms")
public class ExamRoomController {
    @Autowired
    private ExamRoomService examRoomService;

    @GetMapping
    public List<ExamRoom> getAll() {
        return examRoomService.getAll();
    }

    @PostMapping
    public  ExamRoom create(@RequestBody ExamRoom examRoom) {
        return  examRoomService.create(examRoom);
    }

}
