package com.thouin.feedbook.controller;

import com.thouin.feedbook.model.Item;
import com.thouin.feedbook.model.ResponseData;
import com.thouin.feedbook.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Created by jessethouin on 11/14/17.
 */
@RestController
public class ItemController {
    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @RequestMapping(
            path = "/items/",
            method = RequestMethod.GET,
            produces = "application/json")
    public List<Item> getItems() {
        return itemService.getItems();
    }

    @RequestMapping(
            path = "/items/user/{userId}/startDate/{startDate}/count/{count}",
            method = RequestMethod.GET,
            produces = "application/json")
    public ResponseData getItems(
            @PathVariable("userId") Long userId,
            @PathVariable("startDate") String startDate,
            @PathVariable("count") Integer count) {
        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ISO_DATE_TIME;
        LocalDateTime startLocalDateTime = LocalDateTime.parse(startDate, dateTimeFormat);
        return itemService.getItems(userId, startLocalDateTime, count);
    }
}
