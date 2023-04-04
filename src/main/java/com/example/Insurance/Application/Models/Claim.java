package com.example.Insurance.Application.Models;

import jakarta.persistence.*;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int claimNumber;
    private String description;
    @DateTimeFormat(pattern = "YYYY:MM:DD")
    private Date claimDate;
    private String claimStatus;

    public Claim() {
    }

    public Claim(int claimNumber, String description, Date claimDate, String claimStatus) {

        this.claimNumber = claimNumber;
        this.description = description;
        this.claimDate = claimDate;
        this.claimStatus = claimStatus;
    }
    @ManyToOne
    @JoinColumn
    private InsurancePolicy insurancePolicy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClaimNumber() {
        return claimNumber;
    }

    public void setClaimNumber(int claimNumber) {
        this.claimNumber = claimNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(Date claimDate) {
        this.claimDate = claimDate;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    public InsurancePolicy getInsurancePolicy() {
        return insurancePolicy;
    }

    public void setInsurancePolicy(InsurancePolicy insurancePolicy) {
        this.insurancePolicy = insurancePolicy;
    }
}
