package com.test.customer.services;

import com.test.customer.controllers.dtos.CustomerRequest;
import com.test.customer.entities.Customer;

import java.util.List;


public interface ICustomerService {
    Customer createCustomer(CustomerRequest request);
    Customer updateCustomer(CustomerRequest request);
    List<Customer> findAllCustomers();
    Customer findCustomerById(String id);
    Boolean existsCustomerById(String id);
    void deleteCustomerById(String id);
}
