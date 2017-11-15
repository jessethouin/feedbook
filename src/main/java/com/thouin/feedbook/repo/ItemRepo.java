package com.thouin.feedbook.repo;

import com.thouin.feedbook.model.Item;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by jessethouin on 11/14/17.
 */
@Repository
public interface ItemRepo extends JpaRepository<Item, Long> {
    List<Item> findByPublisherIdAndPublishDateTimeLessThanEqualOrderByPublishDateTime(
            @Param("publisherId") Long publisherId,
            @Param("startDate") Timestamp startDateTime,
            Pageable pageable);
}
