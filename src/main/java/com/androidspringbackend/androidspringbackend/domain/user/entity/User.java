package com.androidspringbackend.androidspringbackend.domain.user.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@EqualsAndHashCode(of = "id")
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userIndexId;
    private String userEmail;
    private String userPassword;
    private String userName;

}
