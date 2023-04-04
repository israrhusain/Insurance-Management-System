package com.example.Insurance.Application.Service;
import com.example.Insurance.Application.Models.Client;
import com.example.Insurance.Application.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public String addCient(Client client){
        
        clientRepository.save(client);
     return "client add successfully";
    }

    public String updateClient(Client client,Integer clientId) throws Exception{

           Client client1 = clientRepository.findById(clientId).get();
           client1.setName(client.getName());
           client1.setDob(client.getDob());
           client1.setAddress(client.getAddress());
           client1.setMobileNumber(client.getMobileNumber());
         if(client1!=null) {
             clientRepository.save(client1);
         }

         else {
             throw new Exception("client does not exist");
         }

         return "client update successfully";

    }

    public Client getClient(int clientId) throws Exception{

        Client client= clientRepository.findById(clientId).get();
        if(client==null){
            throw new Exception("not found");
        }
        return client;
    }

    public List<Client> getAllClients() throws Exception{
        List<Client> list=clientRepository.findAll();
        if(list==null){
            throw new Exception("client not found");
        }
        return list;
    }

    public String deleteClient(Integer clientId) throws Exception{
        Client client=clientRepository.findById(clientId).get();
        if(client!=null){
            clientRepository.deleteById(clientId);
        }
        else{
            throw new Exception("client does not exist");
        }

        return "client delete successfully";
    }
}
