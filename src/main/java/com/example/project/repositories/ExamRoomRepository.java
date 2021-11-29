package com.example.project.repositories;

import com.example.project.entities.ExamRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRoomRepository extends JpaRepository<ExamRoom, Long> {
}
