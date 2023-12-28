package com.thinknxt.csp.services;

import com.thinknxt.csp.dto.SignupRequest;
import com.thinknxt.csp.entities.Customer;

public interface AuthService {
    Customer createCustomer(SignupRequest signupRequest);
}
