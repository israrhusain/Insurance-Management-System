package com.example.Insurance.Application.Convertors;

import com.example.Insurance.Application.DTos.DtoClaim;
import com.example.Insurance.Application.Models.Claim;

public class ClaimConvertor {
    
    public static Claim DtoToClaimEntity(DtoClaim dtoClaim){
        Claim claim=new Claim();
        claim.setClaimNumber(dtoClaim.getClaimNumber());
        claim.setClaimStatus(dtoClaim.getClaimStatus());
        claim.setClaimDate(dtoClaim.getClaimDate());
        claim.setDescription(dtoClaim.getDescription());
        return claim;

    }
}
