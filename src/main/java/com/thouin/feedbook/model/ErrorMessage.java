package com.thouin.feedbook.model;

import lombok.Data;

/**
 * Created by jessethouin on 11/14/17.
 */
@Data
public class ErrorMessage {
    public ErrorMessage(String message) {
        this.message = message;
    }

    String message;
}
