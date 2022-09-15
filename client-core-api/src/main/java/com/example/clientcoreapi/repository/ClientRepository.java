package com.example.clientcoreapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {

    ClientEntity getClientEntityById(String clientId);
    List<ClientEntity> getClientEntityBy();
    @Transactional
    void deleteClientEntityById(String clientId);
}
