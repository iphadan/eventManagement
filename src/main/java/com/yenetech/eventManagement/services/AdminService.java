package com.yenetech.eventManagement.services;

import com.yenetech.eventManagement.repositories.AdminRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }
}
