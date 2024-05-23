package com.yenetech.eventManagement.dtos;

import java.time.LocalDateTime;

public class EventDto extends BaseDto {

    private AdminDto createdUser;

    private AdminDto modifiedUser;
    private String name;
    private String description;
    private String Location;
    private String numberOfSeat;
    private Integer normalPrice;
    private Integer vip;
    private  Integer vVip;
    private LocalDateTime schedule;
    private String location;
    private String map;

}
