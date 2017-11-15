package com.thouin.feedbook.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by jessethouin on 11/14/17.
 */
@Entity
@Table(name = "USERS")
@Data
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(name = "USERNAME")
    String username;

    @Column(name = "NAME")
    String name;
}
