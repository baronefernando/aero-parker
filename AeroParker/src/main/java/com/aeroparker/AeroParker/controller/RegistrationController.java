package com.aeroparker.AeroParker.controller;

import com.aeroparker.AeroParker.model.Customers;
import com.aeroparker.AeroParker.repository.CustomerRepository;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/registration")
public class RegistrationController 
{

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public String showRegistrationForm(Model model) 
    {
        model.addAttribute("customer", new Customers());
        return "registrationForm";
    }

    @PostMapping
    public String processRegistration
    (
        @RequestParam("emailAddress") String emailAddress,
        @RequestParam("title") String title,
        @RequestParam("firstName") String firstName,
        @RequestParam("lastName") String lastName,
        @RequestParam("addressLine1") String addressLine1,
        @RequestParam("addressLine2") String addressLine2,
        @RequestParam("city") String city,
        @RequestParam("postcode") String postcode,
        @RequestParam("phoneNumber") String phoneNumber,
        
        Model model)
        {
            if (customerRepository.existsByEmailAddressIgnoreCase(emailAddress)) 
            {
                model.addAttribute("errorMessage", "Email address is already taken.");
                return "registrationForm"; // Return to the registration form view
            }

            Customers customer = new Customers(LocalDateTime.now(), emailAddress.toLowerCase(), title, firstName, lastName, addressLine1,addressLine2,city,postcode, phoneNumber);
            customerRepository.save(customer);
            return "registrationSuccess"; // Return to the success view
    }
}   
