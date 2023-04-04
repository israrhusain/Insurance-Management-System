package com.example.Insurance.Application.Controllers;

import com.example.Insurance.Application.Models.Client;
import com.example.Insurance.Application.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ClientController {

    @Autowired
    ClientService clientservice;

    @PostMapping("POST/api/clients")
    public ResponseEntity<String> addNewClient(@RequestBody Client client){
        clientservice.addCient(client);
        return new ResponseEntity<>(" new client add successfully", HttpStatus.CREATED);
    }

    @PutMapping("PUT/api/clients/{id}")
    public ResponseEntity<String> updateClient(@RequestBody Client client,@PathVariable("id") int id) throws Exception{
        clientservice.updateClient(client,id);
        return new ResponseEntity<>("client update succesfully",HttpStatus.CREATED);
    }

    @GetMapping("GET/api/clients/{id}")
    public ResponseEntity<Client> getClient1(@PathVariable("id") int id) throws Exception{
        Client res=clientservice.getClient(id);
        return new ResponseEntity<>(res,HttpStatus.ACCEPTED);
    }

    @GetMapping("GET/api/clients")
    public ResponseEntity<List<Client>> getAllClients() throws Exception{
        List<Client> list=clientservice.getAllClients();
        return new ResponseEntity<>(list,HttpStatus.ACCEPTED);
    }

    @DeleteMapping("DELETE/api/clients/{id}")
    public ResponseEntity<String> deleteClient(@PathVariable("id") int id) throws Exception{
        clientservice.deleteClient(id);
        return new ResponseEntity<>("client deleted successfully",HttpStatus.OK);
    }
}
