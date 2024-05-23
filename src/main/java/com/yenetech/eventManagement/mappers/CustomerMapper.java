package com.yenetech.eventManagement.mappers;

import com.yenetech.eventManagement.dtos.AdminDto;
import com.yenetech.eventManagement.dtos.CustomerDto;
import com.yenetech.eventManagement.models.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
    CustomerDto toCustomerDTO(Customer customer);
    void copyToCustomerDTO(Customer customer,@MappingTarget CustomerDto customerDto);

    Customer toCustomerEntity(CustomerDto customerDto);

    default List<CustomerDto> customeEntitiesToCustomerDTOs(List<Customer> customers){
        if(customers == null){
return  null;
        }
        List<CustomerDto> customerDTOs =new ArrayList<CustomerDto>(customers.size());
        for(Customer customer : customers){
            customerDTOs.add(toCustomerDTO(customer));
        }
        return customerDTOs;
    }
}
