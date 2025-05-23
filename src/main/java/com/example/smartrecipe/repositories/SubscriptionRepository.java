package com.example.smartrecipe.repositories;
import com.example.smartrecipe.models.Subscription;
import com.example.smartrecipe.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.List;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
    boolean existsBySubscriberAndTarget(User subscriber, User target);
    Optional<Subscription> findBySubscriberAndTarget(User subscriber, User target);
    List<Subscription> findAllBySubscriber(User subscriber);
    List<Subscription> findAllByTarget(User target);
}

