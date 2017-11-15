package com.thouin.feedbook.service;

import com.thouin.feedbook.model.ResponseData;
import com.thouin.feedbook.model.Subscriptions;
import com.thouin.feedbook.model.Item;
import com.thouin.feedbook.repo.SubscriptionsRepo;
import com.thouin.feedbook.repo.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by jessethouin on 11/14/17.
 */
@Service
public class ItemService {

    private final SubscriptionsRepo subscriptionsRepo;
    private final ItemRepo itemRepo;

    @Autowired
    public ItemService(ItemRepo itemRepo, SubscriptionsRepo subscriptionsRepo) {
        this.itemRepo = itemRepo;
        this.subscriptionsRepo = subscriptionsRepo;
    }

    public ResponseData getItems(Long userId, LocalDateTime startDate, Integer count) {
        List<Item> returnItems = new ArrayList<>();
        Pageable limit = new PageRequest(0, count);

        List<Subscriptions> subscriptions = subscriptionsRepo.findByUserId(userId);

        subscriptions.forEach(s -> {
            List<Item> items = itemRepo.findByPublisherIdAndPublishDateTimeLessThanEqualOrderByPublishDateTime(s.getPublisherId(), Timestamp.valueOf(startDate), limit);
            returnItems.addAll(items);
        });

        returnItems.sort(Comparator.comparing(Item::getPublishDateTime).reversed());
        List<Item> itemsSorted;
        LocalDateTime nextDate;
        if (returnItems.size() < count) {
            itemsSorted = returnItems;
            nextDate = itemsSorted.get(itemsSorted.size() - 1).getPublishDateTime().toLocalDateTime();
        } else {
            itemsSorted = returnItems.subList(0, count);
            nextDate = returnItems.get(count).getPublishDateTime().toLocalDateTime();
        }

        return new ResponseData(nextDate.format(DateTimeFormatter.ISO_DATE_TIME), itemsSorted);
    }

    public List<Item> getItems() {
        List<Item> returnItems = itemRepo.findAll();
        returnItems.sort(Comparator.comparing(Item::getPublishDateTime).reversed());
        return returnItems;
    }
}
