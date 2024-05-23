package com.yenetech.eventManagement.repositories;

import com.yenetech.eventManagement.models.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminUser,Long> {
}
