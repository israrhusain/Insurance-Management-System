package com.example.Insurance.Application.DTos;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ResponsePolicyDto {
    private int policyNumber;
    private String policyType;
    private int coverageAmount;
    private int premiumAmount;
    @DateTimeFormat(pattern = "YYYY-MM-DD")
    private Date startDate;
    @DateTimeFormat(pattern = "YYYY-MM-DD")
    private Date endDate;
    
    
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
    public void setStartDate(java.util.Date date) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(java.util.Date date) {
        this.endDate = endDate;
    }


    
}

