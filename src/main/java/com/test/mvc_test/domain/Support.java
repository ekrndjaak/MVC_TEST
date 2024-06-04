package com.test.mvc_test.domain;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;

@jakarta.persistence.Entity
@Data
public class Support {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int BusinessNumber;
    private String businessName;


}

