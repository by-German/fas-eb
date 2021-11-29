package com.example.project.services;

import com.example.project.entities.OfficeVisits;

import java.util.List;

public interface OfficeVisitsService {
    OfficeVisits create(OfficeVisits officeVisits);
    OfficeVisits assignDoctor(Long officeVisitsId, Long doctorId);
    List<OfficeVisits> getAll();
}
