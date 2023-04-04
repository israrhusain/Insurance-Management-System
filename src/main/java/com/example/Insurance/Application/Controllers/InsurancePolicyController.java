package com.example.Insurance.Application.Controllers;

import com.example.Insurance.Application.DTos.Dtopolicy;
import com.example.Insurance.Application.DTos.ResponsePolicyDto;
import com.example.Insurance.Application.Models.InsurancePolicy;
import com.example.Insurance.Application.Service.InsurancePolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InsurancePolicyController {
    @Autowired
    InsurancePolicyService insurancePolicyService;

    @PostMapping("POST/api/policies")
    public ResponseEntity<String> addPolicy(@RequestBody Dtopolicy policy) throws Exception{

            insurancePolicyService.addPolicy(policy);
            return new ResponseEntity<String>("new policy add successfully", HttpStatus.CREATED);



    }

    @PutMapping("PUT/api/policies/{id}")
    public ResponseEntity<String> updatePolicy(@RequestBody Dtopolicy policy, @PathVariable("id") int id){
         insurancePolicyService.updatePolicy(policy,id);
         return new ResponseEntity<>("policy updated successfully",HttpStatus.CREATED);
    }

    @GetMapping("GET/api/policies/{id}")
    public ResponseEntity<ResponsePolicyDto> getPolicy(@PathVariable("id") int id) throws Exception{
        ResponsePolicyDto policy=insurancePolicyService.getPolicy(id);
        return new ResponseEntity<>(policy,HttpStatus.ACCEPTED);
    }

    @GetMapping("GET/api/policies")
    public ResponseEntity<List<ResponsePolicyDto>> getAllpolicies() throws Exception{
        List<ResponsePolicyDto> list=insurancePolicyService.gatAllPolicies();
        return new ResponseEntity<>(list,HttpStatus.ACCEPTED);
    }

    @DeleteMapping("DELETE/api/policies/{id}")
      public ResponseEntity<String> deletePolicy( @PathVariable("id") int id) {
        insurancePolicyService.deletePolicy(id);
        return new ResponseEntity<>("policy deleted successfully",HttpStatus.OK);
    }
}
