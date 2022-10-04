package com.demo.PostCoreApi.repository;
import com.example.clientcoreapi.repository.ClientEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "post_list")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class PostEntity {
    @Id
    @GeneratedValue
    private long id;
    @Column(unique = true)
    private String postid;
    @Column(unique = true)
    private String postRecipientId;
    @Column(nullable = false, length = 50)
    private String postItem;
    @Column(nullable = false, length = 50)
    private String status;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "client_roles", joinColumns = @JoinColumn(name = "client_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<ClientEntity> clientEntities = new HashSet<>();

}
