package com.example.Insurance.Application.Repository;

import com.example.Insurance.Application.Models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Integer> {
    
}
