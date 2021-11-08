package com.dev.spring.app.commons.users.models.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "roles", schema = "db_users")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 30)
    private String name;

//    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "roles")
//    private List<User> users;
}
