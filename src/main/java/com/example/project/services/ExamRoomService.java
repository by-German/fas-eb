package com.example.project.services;

import com.example.project.entities.ExamRoom;

import java.util.List;

public interface ExamRoomService {
    List<ExamRoom> getAll();
    ExamRoom create(ExamRoom examRoom);
}
