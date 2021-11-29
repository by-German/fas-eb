package com.example.project.services.impl;

import com.example.project.entities.ExamRoom;
import com.example.project.repositories.ExamRoomRepository;
import com.example.project.services.ExamRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@Service
public class ExamRoomServiceImpl implements ExamRoomService {
    @Autowired
    private ExamRoomRepository examRoomRepository;

    @Override
    public List<ExamRoom> getAll() {
        return examRoomRepository.findAll();
    }

    @Override
    public ExamRoom create(ExamRoom examRoom) {
        examRoom.setCreateAt(Date.from(Instant.now()));
        return examRoomRepository.save(examRoom);
    }
}
