package com.example.Insurance.Application.Models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int clientId;

    private String name;

    private String dob;

    private String address;

    private Long mobileNumber;


    @OneToMany(mappedBy = "client" ,cascade=CascadeType.ALL,fetch =FetchType.LAZY )
    private List<InsurancePolicy> insurancePolicy=new ArrayList<>();

    public Client() {
    }

    public Client(String name, String dob, String address, Long mobileNumber) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.mobileNumber = mobileNumber;

    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public List<InsurancePolicy> getInsurancePolicy() {
        return insurancePolicy;
    }

    public void setInsurancePolicy(List<InsurancePolicy> insurancePolicy) {
        this.insurancePolicy = insurancePolicy;
    }
}
