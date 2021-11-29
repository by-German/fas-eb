package com.example.project.repositories;

import com.example.project.entities.OfficeVisits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeVisitsRepository extends JpaRepository<OfficeVisits, Long> {
}
