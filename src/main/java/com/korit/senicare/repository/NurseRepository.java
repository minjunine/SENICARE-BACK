package com.korit.senicare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.korit.senicare.entity.NurseEntity;

@Repository
public interface NurseRepository extends JpaRepository<NurseEntity, String> {
    
    boolean existsByUserId(String userId);
    boolean exisexistsByTelNumber(String telNumber);
    boolean existsByTelNumber(String telNumber);

}