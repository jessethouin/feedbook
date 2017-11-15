package com.thouin.feedbook.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by jessethouin on 11/14/17.
 */
@Entity
@Table(name = "SUBSCRIPTIONS")
@Data
public class Subscriptions {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(name = "PUBLISHER_ID")
    Long publisherId;

    @Column(name = "USER_ID")
    Long userId;
}
