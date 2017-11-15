package com.thouin.feedbook.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by jessethouin on 11/14/17.
 */
@Entity
@Table(name = "ITEMS")
@Data
public class Item {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(name = "TITLE")
    String title;

    @Column(name = "SUMMARY")
    String summary;

    @Column(name = "CONTENT")
    String content;

    @Column(name = "PUBLISH_DATE_TIME")
    Timestamp publishDateTime;

    @Column(name = "PUBLISHER_ID")
    Long publisherId;
}
