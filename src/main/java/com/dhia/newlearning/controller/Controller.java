package com.dhia.newlearning.controller;

import com.dhia.newlearning.entity.Client;
import com.dhia.newlearning.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api/v1")
public class Controller {

    @Autowired
    private ClientService clientService;

    @PostMapping(value="all")
    @ResponseBody
    public Client createClient(@RequestBody Client client ){

        return clientService.createRequest(client) ;

    }




}
