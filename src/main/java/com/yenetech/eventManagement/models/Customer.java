package com.yenetech.eventManagement.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "EventCustomer")
public class Customer extends Base{
    private String fullName;
    private String paymentTicket;
    private Boolean isUsed;
@OneToOne
private EventOccurring event;

}
