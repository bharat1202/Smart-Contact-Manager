package com.scm20.entities;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;

import android.provider.Contacts;

@Entity(name="user")
@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class User {
    @Id
    private String userid;
    @Column(name = "user_name",nullable = false)
    private String name;
    @Column(unique = true,nullable = false)
    private String email;
    private String password;
    @Column(length = 1000)
    private String about;
    @Column(length = 1000)
    private String profilepic;
    private String phoneNumber;
    //information
    private boolean enables=false;
    private boolean emailVerified=false;
    private boolean phoneverified=false;

    //Self, google, facebook,linkedin,twitter,github\
    private  providers provider=providers.SELF;
    private String privateuserid;

    @OneToMany(mappedBy = "user", cascade=CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
    private List<contacts> contacts = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade=CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true)
    private List<SocialLink> sociallinks = new ArrayList<>();




}
