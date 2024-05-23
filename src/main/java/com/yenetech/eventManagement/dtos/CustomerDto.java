package com.yenetech.eventManagement.dtos;

import jakarta.persistence.ManyToMany;

public class CustomerDto extends BaseDto{
    private String fullName;
    private String paymentTicket;
    private Boolean isUsed;

//    private EventDto event;
}
