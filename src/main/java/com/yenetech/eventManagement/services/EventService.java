package com.yenetech.eventManagement.services;

import com.yenetech.eventManagement.dtos.EventDto;
import com.yenetech.eventManagement.dtos.ResultWrapper;
import com.yenetech.eventManagement.mappers.EventMapper;
import com.yenetech.eventManagement.models.EventOccurring;
import com.yenetech.eventManagement.repositories.EventRepository;
import jdk.jfr.Event;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public ResultWrapper<EventDto> createEvent(EventDto eventDto){
        EventOccurring eventOccurring= EventMapper.INSTANCE.toEventEntity(eventDto);
        ResultWrapper<EventDto> resultWrapper= new ResultWrapper<EventDto>();
        try{
            EventDto resultDto=EventMapper.INSTANCE.toEventDTO(eventRepository.save(eventOccurring));
            resultWrapper.setResult(eventDto);
            resultWrapper.setMessage("success");
            resultWrapper.setStatus(true);
            return resultWrapper;
        }
        catch (Exception e){
            resultWrapper.setResult(null);
            resultWrapper.setMessage("event does not exist");
            resultWrapper.setStatus(false);
            return resultWrapper;
        }
    }
    public ResultWrapper<EventDto> getEventById(Long id){
        ResultWrapper<EventDto> resultWrapper= new ResultWrapper<EventDto>();

        try{

            resultWrapper.setResult(EventMapper.INSTANCE.toEventDTO(eventRepository.findById(id).orElse(null)));
            resultWrapper.setMessage("success");
            resultWrapper.setStatus(true);
            return resultWrapper;
        }
        catch (Exception e){
            resultWrapper.setResult(null);
            resultWrapper.setMessage("event does not exist");
            resultWrapper.setStatus(false);
            return resultWrapper;

        }
    }
    public ResultWrapper<EventDto> updateEvent(EventDto eventDto){
        ResultWrapper<EventDto> resultWrapper= new ResultWrapper<EventDto>();

        try{
             resultWrapper.setResult(EventMapper.INSTANCE.toEventDTO((eventRepository.save(EventMapper.INSTANCE.toEventEntity(eventDto)))));
            resultWrapper.setMessage("success");
            resultWrapper.setStatus(true);
            return resultWrapper;
        }catch (Exception e){
            resultWrapper.setResult(null);
            resultWrapper.setMessage("event does not exist");
            resultWrapper.setStatus(false);
            return resultWrapper;

        }


    }
    public String deleteEvent(Long id){
        try{
 eventRepository.deleteById(id);
 return "Deleted";
        }catch (Exception e){
            return "Does not exist";

        }

    }
}
