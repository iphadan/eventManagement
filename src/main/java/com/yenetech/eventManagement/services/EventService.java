package com.yenetech.eventManagement.services;

import com.yenetech.eventManagement.repositories.EventRepository;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }
}
