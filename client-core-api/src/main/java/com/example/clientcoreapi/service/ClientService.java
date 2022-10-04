package com.example.clientcoreapi.service;

import com.example.clientcoreapi.model.ClientRequest;
import com.example.clientcoreapi.model.ClientResponse;

import java.util.List;

public interface ClientService {
    ClientResponse createClient(ClientRequest clientRequest);
    ClientResponse updateClient(ClientRequest clientRequest);
    ClientResponse getClientById(String clientId);
    ClientResponse getClientByName(String clientName);
    ClientResponse getClientBySurname(String clientSurname);
    List<ClientResponse> getAllClient();
    void deleteClientById(String clientId);
}
