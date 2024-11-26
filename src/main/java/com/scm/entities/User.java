package com.scm.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity(name = "user")
@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class User {
    
    @Id
    private String userId;
    
    @Column(name="user_name",nullable=false)
    private String name;

    @Column(unique=true,nullable=false)
    private String email;

    private String password;

    @Column(length=1000)
    private String about;

    @Column(length=1000)
    private String profilePic;
    private String phoneNumber;

    //information
    private boolean enabled=false;
    private boolean emailVerified=false;
    private boolean phoneVerified=false;

    //self,google,linkedin
    private Providers provider=Providers.SELF;
    private String providerUserId;
}
