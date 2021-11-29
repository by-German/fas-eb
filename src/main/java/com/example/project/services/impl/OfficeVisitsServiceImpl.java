package com.example.project.services.impl;

import com.example.project.entities.ExamRoom;
import com.example.project.entities.OfficeVisits;
import com.example.project.repositories.ExamRoomRepository;
import com.example.project.repositories.OfficeVisitsRepository;
import com.example.project.services.OfficeVisitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@Service
public class OfficeVisitsServiceImpl implements OfficeVisitsService {
    @Autowired
    private OfficeVisitsRepository officeVisitsRepository;

    @Autowired
    private ExamRoomRepository examRoomRepository;

    @Override
    public OfficeVisits create(OfficeVisits officeVisits) {
        List<ExamRoom> results =  examRoomRepository.findAll();
        if (results.isEmpty()) throw new RuntimeException("There are no exam rooms, please create one");

        for (ExamRoom result : results) {
            if (result.isAvailability()) {
                result.setAvailability(false);
                examRoomRepository.save(result);
                officeVisits.setCreateAt(Date.from(Instant.now()));
                officeVisits.setExamRoom(result);
                return officeVisitsRepository.save(officeVisits);
            }
        }

        throw new RuntimeException("no available exam room found");
    }

    @Override
    public OfficeVisits assignDoctor(Long officeVisitsId, Long doctorId) {
        OfficeVisits office = officeVisitsRepository.findById(officeVisitsId).orElseThrow(() -> new RuntimeException("Office visit with id " + officeVisitsId + " not found"));

        office.setDoctorId(doctorId);
        return officeVisitsRepository.save(office);
    }

    @Override
    public List<OfficeVisits> getAll() {
        return officeVisitsRepository.findAll();
    }

}
