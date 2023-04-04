package com.example.Insurance.Application.DTos;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ResponseClaimDto {
    
    private int claimNumber;
    private String description;

    @DateTimeFormat(pattern = "YYYY:MM:DD")
    private Date claimDate;
    private String claimStatus;
    

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
   


    
}


