package com.test.mvc_test.service;

import com.test.mvc_test.domain.Support;
import com.test.mvc_test.repository.SupportRepository;
import lombok.RequiredArgsConstructor;

import java.util.*;

@org.springframework.stereotype.Service
public class Service {

    private final SupportRepository repository;

    public List<Support> getAllEntity(){
        return repository.findAll();
    }

    public Service(SupportRepository repository){
        this.repository = repository;
    }
}