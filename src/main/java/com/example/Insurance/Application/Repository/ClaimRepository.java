package com.example.Insurance.Application.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Insurance.Application.Models.Claim;

@Repository
public interface ClaimRepository extends JpaRepository<Claim,Integer> {
    
}
