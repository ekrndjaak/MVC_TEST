package com.test.mvc_test.service;

import com.test.mvc_test.domain.Support;
import com.test.mvc_test.repository.SupportRepository;

import java.util.*;


public class SupportService {

    private final SupportRepository repository;

    public List<Support> getAllEntity(){
        return repository.findAll();
    }

    public SupportService(SupportRepository repository){
        this.repository = repository;
    }
}