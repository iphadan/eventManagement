package com.yenetech.eventManagement.mappers;

import com.yenetech.eventManagement.dtos.AdminDto;
import com.yenetech.eventManagement.models.Admin;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.TargetType;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface AdminMapper{
    AdminMapper INSTANCE = Mappers.getMapper(AdminMapper.class);
AdminDto toDTO(Admin admin);
void copyToDTO(Admin admin, @MappingTarget AdminDto adminDto);
Admin toAdminEntity(AdminDto adminDto);

    default List<AdminDto> AdminDTOToAminDTOs(List<Admin> admins) {
        if (admins == null) {
            return null;
        }

        List<AdminDto> list = new ArrayList<AdminDto>(admins.size());
        for (Admin admin : admins) {
            list.add(toDTO(admin));
        }

        return list;
    }

}
