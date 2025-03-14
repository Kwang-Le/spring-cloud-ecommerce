package com.test.customer.controllers.dtos;

import com.test.customer.entities.Address;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(
        String id,
        @NotNull(message = "customer firstName is required")
        String firstName,
        @NotNull(message = "customer lastName is required")
        String lastName,
        @Email(message = "customer email is required")
        String email,
        Address address
) {
}
