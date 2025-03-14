package com.test.customer.services;

import com.test.customer.controllers.dtos.CustomerRequest;
import com.test.customer.entities.Customer;
import com.test.customer.exceptions.model.BaseException;
import com.test.customer.repositories.CustomerRepository;
import com.test.customer.utils.mappers.CustomerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService implements ICustomerService {

    private final CustomerRepository customerRepository;

    private final CustomerMapper customerMapper;

    @Override
    public Customer createCustomer(CustomerRequest request) {
        return customerRepository.save(customerMapper.customerRequestToCustomer(request));
    }

    @Override
    public Customer updateCustomer(CustomerRequest request) {
        var customer = customerRepository.findById(request.id()).orElseThrow(() -> new BaseException("Customer not found"));
        customerMapper.updateCustomer(customer, request);
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findCustomerById(String id) {
        return customerRepository.findById(id).orElseThrow(() -> new BaseException("Customer not found"));
    }

    @Override
    public Boolean existsCustomerById(String id) {
        return customerRepository.existsById(id);
    }

    @Override
    public void deleteCustomerById(String id) {
        var customer = customerRepository.findById(id).orElseThrow(() -> new BaseException("Customer not found"));
        customerRepository.deleteById(id);
    }
}
