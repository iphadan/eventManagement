package com.yenetech.eventManagement.mappers;

import com.yenetech.eventManagement.dtos.AdminDto;
import com.yenetech.eventManagement.models.AdminUser;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface AdminMapper{
    AdminMapper INSTANCE = Mappers.getMapper(AdminMapper.class);
AdminDto toDTO(AdminUser admin);
void copyToDTO(AdminUser admin, @MappingTarget AdminDto adminDto);
AdminUser toAdminEntity(AdminDto adminDto);

    default List<AdminDto> AdminDTOToAminDTOs(List<AdminUser> admins) {
        if (admins == null) {
            return null;
        }

        List<AdminDto> list = new ArrayList<AdminDto>(admins.size());
        for (AdminUser admin : admins) {
            list.add(toDTO(admin));
        }

        return list;
    }

}
