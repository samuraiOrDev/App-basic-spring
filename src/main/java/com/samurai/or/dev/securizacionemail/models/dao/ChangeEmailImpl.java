package com.samurai.or.dev.securizacionemail.models.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.samurai.or.dev.securizacionemail.models.entities.ChangeEmail;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class ChangeEmailImpl implements IChangeEmail {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public List<com.samurai.or.dev.securizacionemail.models.entities.ChangeEmail> findAll() {
        return em.createQuery("from ChangeEmail").getResultList();

    }

    @Override
    @Transactional
    public void save(ChangeEmail changeEmail) {
        em.persist(changeEmail);
    }

}
