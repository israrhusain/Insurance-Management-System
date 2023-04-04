package com.example.Insurance.Application.DTos;


import java.util.*;



public class ResponsePolicyDto {
    private int policyNumber;
    private String policyType;
    private int coverageAmount;
    private int premiumAmount;
   
    private Date startDate;
   
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
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
   
   


    
}

