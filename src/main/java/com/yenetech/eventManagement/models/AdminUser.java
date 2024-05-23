package com.yenetech.eventManagement.models;

import jakarta.persistence.Entity;

@Entity
public class AdminUser extends Base {

    private String username;
    private String fullName;
    private String email;
    private String phoneNumber;
    private Character gender;

}
