package org.bajiepka.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String adminHole() {
        return "home";
    }

}
