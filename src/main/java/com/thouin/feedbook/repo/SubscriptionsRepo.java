package com.thouin.feedbook.repo;

import com.thouin.feedbook.model.Subscriptions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jessethouin on 11/14/17.
 */
@Repository
public interface SubscriptionsRepo extends JpaRepository<Subscriptions, Long> {
    List<Subscriptions> findByUserId(@Param("userId") Long userId);
}
