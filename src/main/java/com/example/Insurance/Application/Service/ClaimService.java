package com.example.Insurance.Application.Service;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Insurance.Application.Convertors.ClaimConvertor;
import com.example.Insurance.Application.DTos.DtoClaim;
import com.example.Insurance.Application.DTos.ResponseClaimDto;
import com.example.Insurance.Application.Models.Claim;
import com.example.Insurance.Application.Models.InsurancePolicy;
import com.example.Insurance.Application.Repository.ClaimRepository;
import com.example.Insurance.Application.Repository.InsurancePolicyRepository;

@Service
public class ClaimService {
    @Autowired
    ClaimRepository claimRepository;
    
    @Autowired
    InsurancePolicyRepository insurancePolicyRepository;
    
    public String addClaim(DtoClaim dtoclaim) throws Exception{
       
        Claim claim=ClaimConvertor.DtoToClaimEntity(dtoclaim);

        int id=dtoclaim.getPolicyId();
        InsurancePolicy policy=insurancePolicyRepository.findById(id).get();
        claim.setInsurancePolicy(policy);
        
        java.util.List<Claim> list=policy.getClaims();
        list.add(claim);
        policy.setClaims(list);

        insurancePolicyRepository.save(policy);
        return "add successfully";
    }

    public String upDateClaim(DtoClaim claim,int id) throws Exception{
          Claim claim1=claimRepository.findById(id).get();
          claim1.setClaimNumber(claim.getClaimNumber());
          claim1.setClaimStatus(claim.getClaimStatus());
          claim1.setClaimDate(claim.getClaimDate());
          claim1.setDescription(claim.getDescription());

        int Id=claim.getPolicyId();
        InsurancePolicy policy=insurancePolicyRepository.findById(Id).get();
        claim1.setInsurancePolicy(policy);
        
        java.util.List<Claim> list=policy.getClaims();
        list.add(claim1);
        policy.setClaims(list);

        insurancePolicyRepository.save(policy);

        return "claim update successfully";
    }

    public ResponseClaimDto getClaim(int id) throws Exception{

         ResponseClaimDto claimDto=new ResponseClaimDto();
         Claim claim=claimRepository.findById(id).get();
         claimDto.setClaimNumber(claim.getClaimNumber());
         claimDto.setClaimStatus(claim.getClaimStatus());
         claimDto.setClaimDate(claim.getClaimDate());
         claimDto.setDescription(claim.getDescription());
         return claimDto;
    }

    public List<ResponseClaimDto> getAllclaims() throws Exception{
          java.util.List<Claim> list=claimRepository.findAll();

          List<ResponseClaimDto> claimDtoslist=new ArrayList<>();

          for(Claim claim:list){
              ResponseClaimDto claimDto=new ResponseClaimDto();
             claimDto.setClaimNumber(claim.getClaimNumber());
               claimDto.setClaimStatus(claim.getClaimStatus());
             claimDto.setClaimDate(claim.getClaimDate());
              claimDto.setDescription(claim.getDescription());
              claimDtoslist.add(claimDto);
          }
          return claimDtoslist;
    }

    public String deleteClaim(int id) throws Exception{
           claimRepository.deleteById(id);
           return "claim deleted successfully";
    }
}
