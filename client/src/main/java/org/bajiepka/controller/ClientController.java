package org.bajiepka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("/client")
public class ClientController {

    @RequestMapping(method = RequestMethod.GET)
    public String clientHome() {
        return "client";
    }

}
