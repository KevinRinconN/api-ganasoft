package com.api.ganasoft.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.ganasoft.demo.models.Cattle;

@Repository
public interface CattleRepository extends JpaRepository<Cattle, Long>{

    List<Cattle> findByGender(String gender);
    List<Cattle> findByBreed(String breed);
    Optional<Cattle> findByDistinctiveTrait(String distinctiveTrait);
}
