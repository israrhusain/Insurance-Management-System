package com.example.Insurance.Application.Repository;

import com.example.Insurance.Application.Models.InsurancePolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsurancePolicyRepository extends JpaRepository<InsurancePolicy,Integer> {
}
