package com.spring.security.springsecurity.models;

import lombok.Getter;
import lombok.Setter;
import net.minidev.json.annotate.JsonIgnore;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "security_user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column
    private String username;

    @JsonIgnore
    @Column
    private String password;

    @Column(name = "first_name")
    private String firstName;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private List<Role> roles;

}
