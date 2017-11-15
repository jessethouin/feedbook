package com.thouin.feedbook.model;

import lombok.Data;

import java.util.List;

/**
 * Created by jessethouin on 11/14/17.
 */
@Data
public class ResponseData {
    String lastDate;
    List<Item> items;

    public ResponseData(String lastDate, List<Item> items) {
        this.lastDate = lastDate;
        this.items = items;
    }
}
