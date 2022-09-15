package com.example.clientcoreapi.model;

import lombok.Data;
import org.springframework.data.geo.GeoModule;
@Data
public class ClientResponse {
    private String clientId;
    private String clientName;
    private String clientSurname;
    private String clientUserName;
    private String clientUserPassword;
    GeoModule clientLocation;
}
