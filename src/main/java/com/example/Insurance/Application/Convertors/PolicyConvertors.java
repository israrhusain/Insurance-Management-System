package com.example.Insurance.Application.Convertors;

import com.example.Insurance.Application.DTos.Dtopolicy;
import com.example.Insurance.Application.Models.InsurancePolicy;

public class PolicyConvertors {
     
    public static  InsurancePolicy DtopolicytoEntity(Dtopolicy policydto){
           
            InsurancePolicy policy=new InsurancePolicy();
            policy.setCoverageAmount(policydto.getCoverageAmount());
            policy.setPolicyNumber(policydto.getPolicyNumber());
            policy.setPolicyType(policydto.getPolicyType());
            policy.setPremiumAmount(policydto.getPremiumAmount());
            policy.setStartDate(policydto.getStartDate());
            policy.setEndDate(policydto.getEndDate());
           return policy;
    }
}
