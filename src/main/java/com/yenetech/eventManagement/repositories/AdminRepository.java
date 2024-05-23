package com.yenetech.eventManagement.repositories;

import com.yenetech.eventManagement.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Long> {
}
