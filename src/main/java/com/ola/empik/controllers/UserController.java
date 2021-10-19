package com.ola.empik.controllers;

import com.ola.empik.models.UserInformation;
import com.ola.empik.services.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping("/users/{login}")
    public UserInformation metodaController(@PathVariable String login) {
        log.warn("uczymy się pilnie {}", login);
        return userService.process();
    }
}
