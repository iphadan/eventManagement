package com.yenetech.eventManagement.models;

import jakarta.persistence.*;
import lombok.Data;
@Data
@MappedSuperclass

public class Base {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

}
