package com.example.clientcoreapi.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.geo.GeoModule;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "client_list")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientEntity {
    @Id
    @GeneratedValue
    private long id;
    @Column(unique = true)
    private String clientId;
    @Column(nullable = false, length = 50)
    private String clientName;
    @Column(nullable = false, length = 50)
    private String clientSurname;
    @Column(nullable = false, length = 50)
    private String clientUserName;
    private String clientUserPassword;
    @Column
    GeoModule clientLocation;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "client_role_table", joinColumns = @JoinColumn(name = "client_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<RoleEntity> roleEntities = new HashSet<>();

}
