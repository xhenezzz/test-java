package com.example.clientcoreapi.repository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@EnableJpaRepositories
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {

    ClientEntity getClientEntityById(String clientId);
    ClientEntity getClientEntityByName(String clientName);
    ClientEntity getClientEntityBySurname(String clientSurname);
    List<ClientEntity> getClientEntityBy();
    @Transactional
    void deleteClientEntityById(String clientId);
}
