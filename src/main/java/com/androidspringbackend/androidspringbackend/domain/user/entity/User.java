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
    @Column(name = "user_idx_id", nullable = false)
    private Integer userIdxId;

    @Column(name = "branch", nullable = true)
    private String branch;

    @Column(name = "location", nullable = true)
    private String location;

    @Column(name = "user_name", nullable = true)
    private String userName;

}
