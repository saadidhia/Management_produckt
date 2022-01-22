package com.dhia.newlearning.service;

import static java.util.Optional.ofNullable;
import com.dhia.newlearning.entity.Client;
import com.dhia.newlearning.repository.ClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Slf4j
@Service
public class ClientService {


    @Autowired
    private ClientRepository clientRepository;


    public Client createRequest(Client client){
        return  ofNullable(client).
                map(clientRepository::save).
                orElseThrow(()->{
                    log.error("cannot create this Client");
                    return new ResponseStatusException(HttpStatus.BAD_REQUEST, "Cannot create Client!");
                });


    }
}
