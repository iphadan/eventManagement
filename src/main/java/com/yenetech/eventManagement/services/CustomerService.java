package com.yenetech.eventManagement.services;

import com.yenetech.eventManagement.dtos.CustomerDto;
import com.yenetech.eventManagement.dtos.ResultWrapper;
import com.yenetech.eventManagement.mappers.CustomerMapper;
import com.yenetech.eventManagement.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public ResultWrapper<CustomerDto> registerCustomerToEvent(CustomerDto customerDto){
        ResultWrapper<CustomerDto> resultWrapper = new ResultWrapper<CustomerDto>();
        try{
            resultWrapper.setResult(CustomerMapper.INSTANCE.toCustomerDTO(customerRepository.save(CustomerMapper.INSTANCE.toCustomerEntity(customerDto))));
            resultWrapper.setMessage("success");
            resultWrapper.setStatus(true);
            return resultWrapper;
        }catch (Exception e){
            resultWrapper.setResult(null);
            resultWrapper.setMessage("registration failed");
            resultWrapper.setStatus(false);
            return resultWrapper;
        }

    }
    public ResultWrapper<CustomerDto> getCustomerEventRegister(Long id){
        ResultWrapper<CustomerDto> resultWrapper = new ResultWrapper<CustomerDto>();
        try{
            resultWrapper.setResult(CustomerMapper.INSTANCE.toCustomerDTO(customerRepository.findById(id).orElse(null)) );
            if(resultWrapper.getResult() == null){
                throw new Exception("something wrong");
            }
            resultWrapper.setMessage("success");
            resultWrapper.setStatus(true);
            return resultWrapper;
        }catch (Exception e){
            resultWrapper.setResult(null);
            resultWrapper.setMessage("Does not exist");
            resultWrapper.setStatus(false);
            return resultWrapper;
        }
    }
    public ResultWrapper<List<CustomerDto>> getAllCustomerRegistration(){
        ResultWrapper<List<CustomerDto>> resultWrapper= new ResultWrapper<List<CustomerDto>>();
        try{
            resultWrapper.setResult(CustomerMapper.INSTANCE.customeEntitiesToCustomerDTOs((customerRepository.findAll())));
            resultWrapper.setMessage("success");
            resultWrapper.setStatus(true);
            return resultWrapper;
    }catch (Exception e){
            resultWrapper.setResult(null);
            resultWrapper.setMessage("Not Found");
            resultWrapper.setStatus(false);
            return resultWrapper;
        }
}

}