package com.yenetech.eventManagement.repositories;

import com.yenetech.eventManagement.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
