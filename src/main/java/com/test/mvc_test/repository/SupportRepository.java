package com.test.mvc_test.repository;

import com.test.mvc_test.domain.Support;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
@RequiredArgsConstructor
@Slf4j
public class SupportRepository {

    private final EntityManager em;

    public List<Support> findAll(){
        List<Support> list = em.createQuery("SELECT n FROM Support n", Support.class)
                .getResultList();

        return list;
    }

}