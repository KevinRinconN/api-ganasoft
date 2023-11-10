package com.api.ganasoft.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.ganasoft.demo.models.Treatment;

@Repository
public interface TreatmentRepository extends JpaRepository<Treatment, Long>{
    
}
