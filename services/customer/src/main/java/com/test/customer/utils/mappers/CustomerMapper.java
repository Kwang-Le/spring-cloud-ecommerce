package com.test.customer.utils.mappers;

import com.test.customer.controllers.dtos.CustomerRequest;
import com.test.customer.entities.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CustomerMapper {
    Customer customerRequestToCustomer(CustomerRequest customerRequest);

    void updateCustomer(@MappingTarget Customer customer, CustomerRequest customerRequest);
}
