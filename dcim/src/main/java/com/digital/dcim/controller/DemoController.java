package com.digital.dcim.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class DemoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @GetMapping("/test")
    public ResponseEntity<String> submitOrder(@RequestParam Map<String, String> params) {
        LOGGER.info("Inside submitOrder. Params {}", params);

        return new ResponseEntity<>("Test is successful", HttpStatus.OK);
    }
}
