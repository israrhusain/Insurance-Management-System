package com.example.Insurance.Application.Models;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class InsurancePolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private int policyNumber;
    private String policyType;
    private int coverageAmount;
    private int premiumAmount;
    @DateTimeFormat(pattern = "YYYY-MM-DD")
    private Date startDate;
    @DateTimeFormat(pattern = "YYYY-MM-DD")
    private Date endDate;

    public InsurancePolicy() {
    }

    public InsurancePolicy(int policyNumber, String policyType, int coverageAmount, int premiumAmount, Date startDate, Date endDate, Client client) {

        this.policyNumber = policyNumber;
        this.policyType = policyType;
        this.coverageAmount = coverageAmount;
        this.premiumAmount = premiumAmount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.client = client;
    }
    @ManyToOne
    @JoinColumn
    private Client client;

    @OneToMany(mappedBy="insurancePolicy",cascade=CascadeType.ALL)
    private List<Claim> claims=new ArrayList<>();

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public int getCoverageAmount() {
        return coverageAmount;
    }

    public void setCoverageAmount(int coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    public int getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(int premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Claim> getClaims() {
        return claims;
    }

    public void setClaims(List<Claim> claims) {
        this.claims = claims;
    }

   

    
}
