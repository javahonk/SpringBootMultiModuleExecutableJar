package com.digital.authorization.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class AuthorizationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthorizationController.class);

    @GetMapping("/admin")
    public ResponseEntity<String> submitOrder(@RequestParam Map<String, String> params) {

        LOGGER.info("Exiting submitOrder. response: {}");
        return new ResponseEntity<String>("Status successful",HttpStatus.OK);
    }
}
