package com.yenetech.eventManagement.repositories;

import com.yenetech.eventManagement.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Long> {
}
