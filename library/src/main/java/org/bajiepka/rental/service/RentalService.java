package org.bajiepka.rental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentalService {

    @Autowired
    private RentalProperties properties;

    public String message() {
        return properties.getMessage();
    }

}
