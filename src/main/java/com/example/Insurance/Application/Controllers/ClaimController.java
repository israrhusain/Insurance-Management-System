package com.example.Insurance.Application.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Insurance.Application.DTos.DtoClaim;
import com.example.Insurance.Application.DTos.ResponseClaimDto;
import com.example.Insurance.Application.Service.ClaimService;

@RestController
public class ClaimController {
    
    @Autowired
    ClaimService claimService;

    @PostMapping("POST/api/claims")
    public ResponseEntity<String> addNewClaim(@RequestBody DtoClaim claim) throws Exception{
        claimService.addClaim(claim);
        return new ResponseEntity<>(" new claim add successfully", HttpStatus.CREATED);
    }

    @PutMapping("PUT/api/claims/{id}")
    public ResponseEntity<String> updateClaim(@RequestBody DtoClaim claim,@PathVariable("id") int id) throws Exception{
        claimService.upDateClaim(claim,id);
        return new ResponseEntity<>("client update succesfully",HttpStatus.CREATED);
    }

    @GetMapping("GET/api/claims/{id}")
    public ResponseEntity<ResponseClaimDto> getClaim1(@PathVariable("id") int id) throws Exception{
        ResponseClaimDto res=claimService.getClaim(id);
        return new ResponseEntity<>(res,HttpStatus.ACCEPTED);
    }

    @GetMapping("GET/api/claims")
    public ResponseEntity<List<ResponseClaimDto>> getAllClaims() throws Exception{
        List<ResponseClaimDto> list=claimService.getAllclaims();
        return new ResponseEntity<>(list,HttpStatus.ACCEPTED);
    }

    @DeleteMapping("DELETE/api/claims/{id}")
    public ResponseEntity<String> deleteClaim(@PathVariable("id") int id) throws Exception{
        claimService.deleteClaim(id);
        return new ResponseEntity<>("client deleted successfully",HttpStatus.OK);
    }
}


