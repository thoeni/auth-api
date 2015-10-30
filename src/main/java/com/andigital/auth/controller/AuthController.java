package com.andigital.auth.controller;

import com.andigital.auth.dto.AuthResponse;
import com.andigital.auth.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by antoniotroina
 * on 28/10/2015.
 */
@RestController
@RequestMapping("/login")
public class AuthController {

    Logger logger = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public final AuthResponse login(@RequestParam(value = "id", required = true) String id) {

        logger.info("Id: "+id);

        return new AuthResponse(userService.getUserById(id), "340ct97qy3x4r27943ry9283n4");
    }

}


