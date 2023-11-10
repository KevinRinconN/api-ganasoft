package com.api.ganasoft.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.ganasoft.demo.models.Client;
import com.api.ganasoft.demo.repository.ClientRepository;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<Client> getClients(){
        return clientRepository.findAll();
    }

    public Optional<Client> getClient(Long id){
        return clientRepository.findById(id);
    }

    public Client saveClient (Client client){
        clientRepository.save(client);
        return client;
    }

    public void delete (Long id){
        clientRepository.deleteById(id);
    }
}
