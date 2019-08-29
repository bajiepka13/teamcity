package org.bajiepka.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(name = "Клиенты", value = "/client")
public class ClientController {

    @RequestMapping(value = "/active", method = RequestMethod.GET)
    public String clientHome() {
        return "client";
    }

}
