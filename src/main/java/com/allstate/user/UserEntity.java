package com.allstate.user;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Data
@Entity
@Builder
@Getter
@Table(name = "USERS")
public class UserEntity {
    @Id
    @Column(name = "ID")
    Float id;

    @Column(name = "NAME")
    String name;

    @Column(name = "IS_ADMIN")
    boolean isAdmin;

    @Column(name = "EMAIL")
    String email;

    @Column(name = "PASSWORD")
    String password;
}
