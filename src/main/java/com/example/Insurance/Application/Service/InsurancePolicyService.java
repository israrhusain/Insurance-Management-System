package com.example.Insurance.Application.Service;

import com.example.Insurance.Application.Convertors.PolicyConvertors;
import com.example.Insurance.Application.DTos.Dtopolicy;
import com.example.Insurance.Application.DTos.ResponsePolicyDto;
import com.example.Insurance.Application.Models.Client;
import com.example.Insurance.Application.Models.InsurancePolicy;
import com.example.Insurance.Application.Repository.ClientRepository;
import com.example.Insurance.Application.Repository.InsurancePolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Policy;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class InsurancePolicyService {

    @Autowired
    InsurancePolicyRepository insurancePolicyRepository;

    @Autowired
    ClientRepository clientRepository;

    public String addPolicy(Dtopolicy dtopolicy) throws Exception{
       
        InsurancePolicy policy=PolicyConvertors.DtopolicytoEntity(dtopolicy);

        int clientId=dtopolicy.getClientId();

        Client client=clientRepository.findById(clientId).get();
        List<InsurancePolicy> list=client.getInsurancePolicy();
        list.add(policy);
        client.setInsurancePolicy(list);

        policy.setClient(client);
           
        clientRepository.save(client);


        return "policy has been added successfully";
    }

    public String updatePolicy(Dtopolicy policy,int id) {
        try {
            InsurancePolicy policy1 = insurancePolicyRepository.findById(id).get();
            policy1.setPolicyNumber(policy.getPolicyNumber());
            policy1.setPolicyType(policy.getPolicyType());
            policy1.setCoverageAmount(policy.getCoverageAmount());
            policy1.setPremiumAmount(policy.getPremiumAmount());
            policy1.setStartDate(policy.getStartDate());
            policy1.setEndDate(policy.getEndDate());
            
            int clientId=policy.getClientId();
            Client client=clientRepository.findById(clientId).get();
            List<InsurancePolicy> list=client.getInsurancePolicy();
            list.add(policy1);
            client.setInsurancePolicy(list);
            policy1.setClient(client);
            clientRepository.save(client);
            
        }
        catch(Exception e){
            return "could not update policy";
        }
        return "policy update successfully";
    }

    public ResponsePolicyDto getPolicy(int id) throws Exception{

        ResponsePolicyDto dtopolicy=new ResponsePolicyDto();

        InsurancePolicy policy=insurancePolicyRepository.findById(id).get();

         dtopolicy.setCoverageAmount(policy.getCoverageAmount());
         dtopolicy.setPolicyNumber(policy.getPolicyNumber());
         dtopolicy.setPremiumAmount(policy.getPremiumAmount());
         dtopolicy.setEndDate(policy.getEndDate());
         dtopolicy.setStartDate(policy.getStartDate());
         dtopolicy.setPolicyType(policy.getPolicyType());
         
        if(policy==null){
            throw new Exception("policy not found");
        }
         return dtopolicy;
    }

    public List<ResponsePolicyDto> gatAllPolicies() throws Exception{

        List<InsurancePolicy> getAllpolicy=insurancePolicyRepository.findAll();

        List<ResponsePolicyDto> policyDtolist=new ArrayList<>();

        for(InsurancePolicy policy:getAllpolicy){
            ResponsePolicyDto dtopolicy=new ResponsePolicyDto();
            dtopolicy.setCoverageAmount(policy.getCoverageAmount());
            dtopolicy.setPolicyNumber(policy.getPolicyNumber());
            dtopolicy.setPremiumAmount(policy.getPremiumAmount());
            dtopolicy.setEndDate(policy.getEndDate());
            dtopolicy.setStartDate(policy.getStartDate());
            dtopolicy.setPolicyType(policy.getPolicyType());
            policyDtolist.add(dtopolicy);
        }
        if(getAllpolicy==null){
            throw new Exception("policy not found");
        }
        return policyDtolist;
    }
     public String deletePolicy(int id){
        try {
            insurancePolicyRepository.deleteById(id);
         }
        catch(Exception e){
            return "cannot delete policy";
        }
        return "policy deleted successfully";
     }
}
