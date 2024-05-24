package com.yenetech.eventManagement.repositories;

import com.yenetech.eventManagement.models.EventOccurring;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<EventOccurring,Long> {
}
