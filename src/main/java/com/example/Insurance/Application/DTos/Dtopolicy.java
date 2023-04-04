package com.example.Insurance.Application.DTos;




import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Dtopolicy {
    
    private int policyNumber;
    private String policyType;
    private int coverageAmount;
    private int premiumAmount;
    @DateTimeFormat(pattern = "YYYY-MM-DD")
    private Date startDate;
    @DateTimeFormat(pattern = "YYYY-MM-DD")
    private Date endDate;
    private int clientId;
    
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
    public int getClientId() {
        return clientId;
    }
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    
}



