package com.aeroparker.AeroParker.repository;

import com.aeroparker.AeroParker.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customers, Long> 
{
    boolean existsByEmailAddressIgnoreCase(String emailAddress);
}

