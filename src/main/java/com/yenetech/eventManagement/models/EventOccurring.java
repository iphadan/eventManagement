package com.yenetech.eventManagement.models;

import com.yenetech.eventManagement.dtos.AdminDto;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;


@Entity
public class EventOccurring extends Base {
    @ManyToOne
    private AdminUser createdUser;
@ManyToOne
    private AdminUser lastModifiedUser;
private String name;
private String description;
private String Location;
private String numberOfSeat;
private Integer normalPrice;
private Integer vip;
private  Integer vVip;
    private String map;
}
