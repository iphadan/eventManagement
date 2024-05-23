package com.yenetech.eventManagement.mappers;

import com.yenetech.eventManagement.dtos.EventDto;
import com.yenetech.eventManagement.models.EventOccurring;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface EventMapper {
    EventMapper INSTANCE = Mappers.getMapper(EventMapper.class);
    EventDto toEventDTO(EventOccurring event);
    void copyToDTO(EventOccurring event, @MappingTarget EventDto eventDto);

    EventOccurring toEventEntity(EventDto eventDto);

    default List<EventDto> EventToEventDTOs(List<EventOccurring> events){
        if(events == null){
            return null;
        }
        List<EventDto> eventDtos =new ArrayList<EventDto>(events.size());
        for(EventOccurring event:events){
            eventDtos.add(toEventDTO(event));

        }
        return eventDtos;
    }
}
