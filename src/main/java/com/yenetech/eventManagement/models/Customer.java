package com.yenetech.eventManagement.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "EventCustomer")
public class Customer extends Base{
}
