package org.bajiepka.rental.controller;

import org.bajiepka.rental.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "Клиенты", value = "/rental")
public class RentalController {

    @Autowired
    private RentalService service;

    @RequestMapping(value = "/active", method = RequestMethod.GET)
    public String activeRents() {
        return service.message();
    }

}
