package com.digital.remotehands.controller;

import com.digital.common.constants.DCIMDLREnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Map;

public class RemoteHandsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RemoteHandsController.class);

    private final RestTemplate restTemplate;

    private HttpEntity<?> entity;

    public RemoteHandsController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostConstruct
    public void init(){
        HttpHeaders headers = new HttpHeaders();
        headers.set(DCIMDLREnum.ACCEPT.getCode(), MediaType.APPLICATION_JSON_VALUE);
        entity = new HttpEntity<>(headers);
    }

    @GetMapping("/RemoteHands")
    public ResponseEntity<String> createServiceNowTicket(@RequestParam Map<String, String> params) {
        LOGGER.info("Inside createServiceNowTicket. Params {}", params);

        LOGGER.info("Exiting createServiceNowTicket.");
        return new ResponseEntity<>("Service now created successfully", HttpStatus.OK);
    }
}
