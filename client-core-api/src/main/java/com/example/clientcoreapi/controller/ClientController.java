package com.example.clientcoreapi.controller;

import com.example.clientcoreapi.model.ClientRequest;
import com.example.clientcoreapi.model.ClientResponse;
import com.example.clientcoreapi.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/client")
public class ClientController {
    @Autowired
    ClientService clientService;

    @PostMapping("/add")
    public ClientResponse createClient(@RequestBody ClientRequest clientRequest){
        return clientService.createClient(clientRequest);
    }

    @PutMapping("/update/{clientId}")
    public ClientResponse updateClient(@RequestParam String clientId, @RequestBody ClientRequest clientRequest){
        clientRequest.setClientId(clientId);
        return clientService.updateClient(clientRequest);
    }

    @GetMapping("/check")
    public String check() {
        return "client-core-api is working!";
    }

    @GetMapping("/{clientId}")
    public ClientResponse getClientById(@RequestBody ClientRequest clientRequest){
        return clientService.getClientById(clientRequest.getClientId());
    }

    @GetMapping("/{clientName}")
    public ClientResponse getClientByName(@RequestBody ClientRequest clientRequest){
        return clientService.getClientByName(clientRequest.getClientName());
    }

    @GetMapping("/{clientSurname}")
    public ClientResponse getClientBySurname(@RequestBody ClientRequest clientRequest){
        return clientService.getClientBySurname(clientRequest.getClientSurname());
    }

    @GetMapping("/all")
    public List<ClientResponse> getALlClient(){
        return clientService.getAllClient();
    }

    @DeleteMapping("/delete/{clientId}")
    void deleteClientById(@RequestBody ClientRequest clientRequest){
        clientService.deleteClientById(clientRequest.getClientId());
    }
}
