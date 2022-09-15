package com.example.postofficeapi.feign;

import com.example.postofficeapi.model.ClientRequest;
import com.example.postofficeapi.model.ClientResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@FeignClient("client-core-api")
public interface ClientFeign {
    @GetMapping("/client/check")
    String checkClient();
    @GetMapping("/client/all")
    List<ClientResponse> getAllClient();
    @GetMapping("/client/{surname}")
    ClientResponse getClientBySurname(String surname);
    @GetMapping("/client/{clientId}")
    ClientResponse getClientById(String clientId);
    @PostMapping("/client/add")
    ClientResponse createClient(ClientRequest clientRequest);
    @PutMapping("client/update/{clientId}")
    ClientResponse updateClient(ClientRequest clientRequest);
}
