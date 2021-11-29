package com.example.project.controllers;

import com.example.project.entities.OfficeVisits;
import com.example.project.services.OfficeVisitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/office-visits")
public class OfficeVisitsController {
    @Autowired
    private OfficeVisitsService officeVisitsService;

    @PostMapping
    public OfficeVisits createOfficeVisits(@RequestBody OfficeVisits officeVisits) {
        return officeVisitsService.create(officeVisits);
    }

    @PutMapping(path = "{officeVisitsId}/doctors/{doctorId}")
    public OfficeVisits assignDoctor(@PathVariable Long officeVisitsId,  @PathVariable Long doctorId) {
        return officeVisitsService.assignDoctor(officeVisitsId, doctorId);
    }

    @GetMapping
    public List<OfficeVisits> getAll() {
        return officeVisitsService.getAll();
    }
}
